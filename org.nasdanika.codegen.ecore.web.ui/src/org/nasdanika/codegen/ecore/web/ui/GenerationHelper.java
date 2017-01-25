package org.nasdanika.codegen.ecore.web.ui;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;

/**
 * Generation helper is available to generators as context service.
 * @author Pavel
 *
 */
public class GenerationHelper {
	
	private EcoreCodeGenerator generator;
	private EObject selection;

	public GenerationHelper(EcoreCodeGenerator generator, EObject selection) {
		this.generator = generator;
		this.selection = selection;
	}
	
	public EcoreCodeGenerator getGenerator() {
		return generator;
	}
	
	public EObject getSelection() {
		return selection;
	}

}
