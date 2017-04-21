package org.nasdanika.codegen.ecore.web.ui;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.Generator;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.Attribute;
import org.nasdanika.codegen.ecore.Class;
import org.nasdanika.codegen.ecore.ConfigurationEntry;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.EcoreCodeGeneratorConfiguration;
import org.nasdanika.codegen.ecore.EcoreFactory;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.Reference;
import org.nasdanika.codegen.ecore.presentation.GenerationTarget;
import org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelFactory;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;
import org.nasdanika.config.Context;
import org.nasdanika.config.JavaExpressionTokenSource;
import org.nasdanika.config.MutableContext;

public class WebUIGenerationTarget implements GenerationTarget {
	
	static final String CONFIG_ID = "org.nasdanika.codegen.ecore.web.ui";

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
		} else if (modelElement instanceof Class) {
			EClassConfiguration configuration = ModelFactory.eINSTANCE.createEClassConfiguration();
			// TODO - pre-load from the model? 
			updateConfiguration(modelElement, configuration);
		} else if (modelElement instanceof Attribute) {
			EAttributeConfiguration configuration = ModelFactory.eINSTANCE.createEAttributeConfiguration();
			// TODO - pre-load from the model? 
			updateConfiguration(modelElement, configuration);
		} else if (modelElement instanceof Reference) {
			EReferenceConfiguration configuration = ModelFactory.eINSTANCE.createEReferenceConfiguration();
			// TODO - pre-load from the model? 
			updateConfiguration(modelElement, configuration);
		} else if (modelElement instanceof org.nasdanika.codegen.ecore.Package) {
			EPackageConfiguration configuration = ModelFactory.eINSTANCE.createEPackageConfiguration();
			// TODO - pre-load from the model? 
			updateConfiguration(modelElement, configuration);
		}		
	}

	private void updateConfiguration(ModelElement modelElement, EObject configuration) {
		for (ConfigurationEntry ce: modelElement.getConfiguration()) {
			if (CONFIG_ID.equals(ce.getId())) {
				return;
			}
		}
		ConfigurationEntry webUI = EcoreFactory.eINSTANCE.createConfigurationEntry();
		webUI.setId(CONFIG_ID);
		webUI.setName("Web UI");
		webUI.setConfiguration(configuration);
		modelElement.getConfiguration().add(webUI);
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
//				for (EClassifier eClassifier: ModelPackage.eINSTANCE.getEClassifiers()) {
//					if (eClassifier instanceof EClass && ModelPackage.Literals.EMODEL_ELEMENT_CONFIGURATION.isSuperTypeOf(((EClass) eClassifier)) && !((EClass) eClassifier).isAbstract()) {
//						System.out.println(generateConfigurationClassDocumentation((EClass) eClassifier));
//					}
//				}				
				
				MutableContext projectWorkContext = context.createSubContext();
				projectWorkContext.setClassLoader(WebUIGenerationTarget.class.getClassLoader());
				EcoreCodeGeneratorConfiguration ecoreCodeGeneratorConfiguration = (EcoreCodeGeneratorConfiguration) generator.getConfiguration("general");
				String projectName = ecoreCodeGeneratorConfiguration.getTargetProject();
				if (projectName == null || projectName.trim().length() == 0) {
					Resource eResource = ecoreCodeGeneratorConfiguration.eResource();
					if (eResource != null) {
						URI resourceURI = eResource.getURI();
						if (resourceURI != null && resourceURI.isPlatformResource()) {
							String platformString = resourceURI.toPlatformString(true);
							IFile modelResource = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
							if (modelResource != null ) {
								projectName = modelResource.getProject().getName();
							}
						}
					}
				}
				if (projectName != null) {
					projectWorkContext.set("project-name", projectName);
				}
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
		return modelElement instanceof EPackage || modelElement instanceof EClass || modelElement instanceof EStructuralFeature;
	}

	// --- Documentation generation ---
	
	private String nameToLabel(String name) {
		StringBuilder ret = new StringBuilder();
		for (String str: StringUtils.splitByCharacterTypeCamelCase(name)) {
			if (ret.length() > 0) {
				ret.append(" ");
			}
			ret.append(StringUtils.capitalize(str));			
		}		
		return ret.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private String generateConfigurationClassDocumentation(EClass eClass) {
		StringBuilder ret = new StringBuilder("# ").append(nameToLabel(eClass.getName())).append(System.lineSeparator());
		
		for (EAttribute attr: eClass.getEAllAttributes()) {
			ret.append(System.lineSeparator()).append("## ").append(nameToLabel(attr.getName())).append(System.lineSeparator());
			
			EAnnotation docAnn = attr.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
			if (docAnn != null) {
				String doc = docAnn.getDetails().get("documentation");
				if (doc != null) {
					ret.append(doc);
				}
			}
			ret.append(System.lineSeparator());
		}

		return ret.toString();
	}
	

}
