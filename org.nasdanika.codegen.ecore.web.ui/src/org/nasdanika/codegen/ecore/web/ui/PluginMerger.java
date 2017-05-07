package org.nasdanika.codegen.ecore.web.ui;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.nasdanika.codegen.Merger;
import org.nasdanika.config.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


/**
 * Merges new route and renderer registrations into the existing plugin file.
 * @author Pavel
 *
 */
public class PluginMerger implements Merger<String> {

	private static final String ECLASS_NAME_ATTRIBUTE = "eclass-name";
	private static final String NAMESPACE_URI_ATTRIBUTE = "namespace-uri";	
	
	private static final String TARGET_ATTRIBUTE = "target";
	private static final String TARGET_NAMESPACE_URI_ATTRIBUTE = "target-namespace-uri";
	private static final String EOBJECT_ROUTE_ELEMENT = "eobject-route";

	@Override
	public String merge(Context context, IFile file, String oldContent, String newContent, IProgressMonitor progressMonitor) throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();		
		Document oldPlugin = dBuilder.parse(new InputSource(new StringReader(oldContent)));
		Document newPlugin = dBuilder.parse(new InputSource(new StringReader(newContent)));

		oldPlugin.getDocumentElement().normalize();
		newPlugin.getDocumentElement().normalize();
		
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		
		// Routes
		XPathExpression routeExtensionSelector = xpath.compile("/plugin/extension[@point='org.nasdanika.web.route']");
		Element newRouteExtensionElement = (Element) routeExtensionSelector.evaluate(newPlugin, XPathConstants.NODE);
		if (newRouteExtensionElement != null) {
			Element oldRouteExtensionElement = (Element) routeExtensionSelector.evaluate(oldPlugin, XPathConstants.NODE);
			if (oldRouteExtensionElement == null) {
				oldPlugin.getDocumentElement().appendChild(oldPlugin.importNode(newRouteExtensionElement, true));
			} else {
				XPathExpression routeExpr = xpath.compile(EOBJECT_ROUTE_ELEMENT);
				NodeList newRoutesList = (NodeList) routeExpr.evaluate(newRouteExtensionElement, XPathConstants.NODESET);
				NodeList oldRoutesList = (NodeList) routeExpr.evaluate(oldRouteExtensionElement, XPathConstants.NODESET);
				N: for (int i=0; i < newRoutesList.getLength(); ++i) {
					Element newRoute = (Element) newRoutesList.item(i);
					for (int j=0; j < oldRoutesList.getLength(); ++j) {
						Element oldRoute = (Element) oldRoutesList.item(j);
						if (newRoute.getAttribute(TARGET_ATTRIBUTE).equals(oldRoute.getAttribute(TARGET_ATTRIBUTE))
								&& newRoute.getAttribute(TARGET_NAMESPACE_URI_ATTRIBUTE).equals(oldRoute.getAttribute(TARGET_NAMESPACE_URI_ATTRIBUTE))) {
							// Existing definition
							continue N;
						}
					}
					// No existing definition
					oldRouteExtensionElement.appendChild(oldPlugin.importNode(newRoute, true));
				}
			}
		}

		// Renderers
		XPathExpression rendererExtensionSelector = xpath.compile("/plugin/extension[@point='org.nasdanika.cdo.web.renderer']");
		Element newRendererExtensionElement = (Element) rendererExtensionSelector.evaluate(newPlugin, XPathConstants.NODE);
		if (newRendererExtensionElement != null) {
			Element oldRendererExtensionElement = (Element) rendererExtensionSelector.evaluate(oldPlugin, XPathConstants.NODE);
			if (oldRendererExtensionElement == null) {
				oldPlugin.getDocumentElement().appendChild(oldPlugin.importNode(newRendererExtensionElement, true));
			} else {
				XPathExpression rendererExpr = xpath.compile("renderer");
				NodeList newRenderersList = (NodeList) rendererExpr.evaluate(newRendererExtensionElement, XPathConstants.NODESET);
				NodeList oldRenderersList = (NodeList) rendererExpr.evaluate(oldRendererExtensionElement, XPathConstants.NODESET);
				N: for (int i=0; i < newRenderersList.getLength(); ++i) {
					Element newRenderer = (Element) newRenderersList.item(i);
					for (int j=0; j < oldRenderersList.getLength(); ++j) {
						Element oldRenderer = (Element) oldRenderersList.item(j);
						if (newRenderer.getAttribute(ECLASS_NAME_ATTRIBUTE).equals(oldRenderer.getAttribute(ECLASS_NAME_ATTRIBUTE))
								&& newRenderer.getAttribute(NAMESPACE_URI_ATTRIBUTE).equals(oldRenderer.getAttribute(NAMESPACE_URI_ATTRIBUTE))) {
							// Existing definition
							continue N;
						}
					}
					// No existing definition
					oldRendererExtensionElement.appendChild(oldPlugin.importNode(newRenderer, true));
				}
			}
		}
		
	    // Use a Transformer for output
	    TransformerFactory tFactory = TransformerFactory.newInstance();
	    Transformer transformer = tFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    
	    DOMSource source = new DOMSource(oldPlugin);
		StringWriter sw = new StringWriter();
	    StreamResult out = new StreamResult(sw);
	    transformer.transform(source, out);
		sw.close();
		progressMonitor.worked(1);
		return sw.toString();
	}

	@Override
	public int getWorkSize() {
		return 1;
	}

}

