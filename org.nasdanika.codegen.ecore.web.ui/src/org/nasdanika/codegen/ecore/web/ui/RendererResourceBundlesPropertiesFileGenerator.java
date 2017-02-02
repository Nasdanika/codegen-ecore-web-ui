package org.nasdanika.codegen.ecore.web.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.Work;
import org.nasdanika.config.Context;

public class RendererResourceBundlesPropertiesFileGenerator implements Work<InputStream> {

	@Override
	public int size() {
		return 1;
	}

	@Override
	public InputStream execute(Context context, SubMonitor monitor) throws Exception {
		EClass eClass = context.get(EClass.class);
		Properties properties = new Properties();
		String[] cca = StringUtils.splitByCharacterTypeCamelCase(eClass.getName());
		for (int i=1; i<cca.length; ++i) {
			cca[i] = cca[i].toLowerCase();
		}
		properties.put("class.label", StringUtils.join(cca, " "));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		properties.store(baos, null);
		baos.close();
		return new ByteArrayInputStream(baos.toByteArray());
	}

}
