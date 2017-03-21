package org.nasdanika.codegen.ecore.web.ui;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.ConfigurationEntry;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.presentation.GenerationTarget;
import org.nasdanika.config.Context;
import org.nasdanika.config.JavaExpressionTokenSource;
import org.nasdanika.config.MutableContext;

public class WebUIGenerationTarget implements GenerationTarget {

	@Override
	public void updateConfiguration(ModelElement modelElement) {
		
		// Inspect current configuration entries and create new ones if needed.
		if (modelElement instanceof EcoreCodeGenerator) {
			for (ConfigurationEntry ce: modelElement.getConfiguration()) {
				if ("general".equals(ce.getId())) {
					return;
				}
			}
			ConfigurationEntry general = EcoreFactory.eINSTANCE.createConfigurationEntry();
			general.setId("general");
			general.setName("General");
			general.setConfiguration(EcoreFactory.eINSTANCE.createEcoreCodeGeneratorConfiguration());
			modelElement.getConfiguration().add(general);
		}
	}

	@Override
	public Work<?> createWork(EcoreCodeGenerator generator, EObject selection) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(CodegenPackage.eNS_URI, CodegenPackage.eINSTANCE);
		URI uri = URI.createPlatformPluginURI("/org.nasdanika.codegen.ecore.web.ui/web-ui.nsdgen", false);
		Resource resource = resourceSet.getResource(uri, true);
		Generator<?> projectGenerator = (Generator<?>) resource.getContents().get(0);
		Work<?> projectWork = projectGenerator.createWork();
		return new Work<Object>() {

			@Override
			public int size() {
				return projectWork.size();
			}

			@Override
			public Object execute(Context context, SubMonitor monitor) throws Exception {
				MutableContext projectWorkContext = context.createSubContext();
				projectWorkContext.setClassLoader(WebUIGenerationTarget.class.getClassLoader());
				EcoreCodeGeneratorConfiguration ecoreCodeGeneratorConfiguration = (EcoreCodeGeneratorConfiguration) generator.getConfiguration("general");
				projectWorkContext.set("project-name", ecoreCodeGeneratorConfiguration.getTargetProject());
				projectWorkContext.set("source-folder", ecoreCodeGeneratorConfiguration.getSourceFolder());
				projectWorkContext.set("base-package", ecoreCodeGeneratorConfiguration.getBasePackage());
				projectWorkContext.set("java", new JavaExpressionTokenSource());
				return projectWork.execute(projectWorkContext, monitor);
			}
			
		};
	}

	@Override
	public boolean isSupported(EModelElement modelElement) {
		// EPackage, EClass, EStructuralFeature.
		return modelElement instanceof EPackage || modelElement instanceof EClass;
	}

}
