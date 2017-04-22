# Route base

The generator creates ``RouteBase`` class per EPackage, this class extends the base 
class specified in the generator model, [Route](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web/apidocs/org/nasdanika/cdo/web/routes/app/Route.html) by default, and implements the generated package's 
[RendererBase](renderer-base.html).

RouteBase binds context type parameter to [CDOTransactionHttpServletRequestContext](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web/apidocs/org/nasdanika/cdo/web/CDOTransactionHttpServletRequestContext.html)&lt;[LoginPasswordCredentials](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.security/apidocs/org/nasdanika/cdo/security/LoginPasswordCredentials.html)&gt;. 

The purpose of this class is to contain application/package wide customizations, e.g. 
defining a custom application page template, navigation header, or additional [@Resource](http://www.nasdanika.org/server/apidocs/org.nasdanika.web/apidocs/org/nasdanika/web/Resource.html) annotations. 


```java
/**
 * Base class for routes defined in the package.
 * @generated
 */
public class RouteBase<T extends EObject> extends Route<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> implements RendererBase<T> {
    /**
     * @generated
     */
    protected RouteBase() throws Exception {
        super(FrameworkUtil.getBundle(RouteBase.class).getBundleContext());

    }

}
```