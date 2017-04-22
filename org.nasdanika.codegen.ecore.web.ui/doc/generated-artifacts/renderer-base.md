# RendererBase

The generation target generates ``RendererBase`` interface per package, renderer interfaces in the package extend the ``RendererBase`` interface. 
The interface itself extends the interface specified in the EPackage configuration, which defaults to [org.nasdanika.cdo.web.routes.app.Renderer](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web/apidocs/org/nasdanika/cdo/web/routes/app/Renderer.html).

RendererBase is intended to application/package wide UI customizations. 
E.g. it can be used to customize the default button icons.

RendererBase binds context type parameter to [CDOTransactionHttpServletRequestContext](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web/apidocs/org/nasdanika/cdo/web/CDOTransactionHttpServletRequestContext.html)&lt; 
[LoginPasswordCredentials](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.security/apidocs/org/nasdanika/cdo/security/LoginPasswordCredentials.html) &gt;. 

Below is an example of generated ``RendererBase``. The class and ``getResourceBundleClasses()`` 
method have ``@generated`` annotation. The generation process merges generated code 
with existing code in the same way as the EMF generator does. If you modify generated 
code, don't forget to either remove or "dirty" the generated annotation, 
e.g. by adding ``NOT`` - ``@generated NOT``.

```java
/**
 * Base interface for renderers defined in the package.
 * @generated
 */
public interface RendererBase<T extends EObject> extends Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> {
	/**
	 * @generated
	 */
	default LinkedList<Class<?>> getResourceBundleClasses(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
		LinkedList<Class<?>> ret = new LinkedList<>();
		ret.add(RendererBase.class);
		ret.addAll(Renderer.super.getResourceBundleClasses(context));
		return ret;

	}

}
```
 