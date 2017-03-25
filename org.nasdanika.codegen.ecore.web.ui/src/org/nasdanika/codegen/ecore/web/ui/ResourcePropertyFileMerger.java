package org.nasdanika.codegen.ecore.web.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.nasdanika.codegen.Merger;
import org.nasdanika.config.Context;

/**
 * Adds new properties to the file without overwriting existing.
 * @author Pavel
 *
 */
public class ResourcePropertyFileMerger implements Merger<InputStream> {

	@Override
	public InputStream merge(Context context, IFile file, InputStream oldContent, InputStream newContent, IProgressMonitor progressMonitor) throws Exception {
		Properties oldProperties = new Properties();
		oldProperties.load(oldContent);
		
		Properties newProperties = new Properties();
		newProperties.load(newContent);
		for (Object pn: Collections.list(newProperties.propertyNames())) {
			if (!oldProperties.containsKey(pn)) {
				oldProperties.setProperty((String) pn, newProperties.getProperty((String) pn));
			}
		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		oldProperties.store(baos, null);
		baos.close();
		progressMonitor.worked(1);
		return new ByteArrayInputStream(baos.toByteArray());
	}

	@Override
	public int getWorkSize() {
		return 1;
	}

}
