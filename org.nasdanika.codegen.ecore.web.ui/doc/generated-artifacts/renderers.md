# Renderers

For each selected EClass the generator creates a render interface for the class and 
a renderer registration in ``plugin.xml``. Renderer for an EClass can be retrieved with 
[Renderer.getRenderer()](http://www.nasdanika.org/server/apidocs/org.nasdanika.cdo.web/apidocs/org/nasdanika/cdo/web/routes/app/Renderer.html#getRenderer-org.eclipse.emf.ecore.EClass-) methods


Generated renderer extends renderers for its EClass supertypes, if they are selected 
in the generation model or [RendererBase](renderer-base.html). 
 
It defines ``chain()`` and ``getResourceBundleClasses()`` methods and ``INSTANCE`` constant. 

Customize Web UI rendering for a particular class by overriding appropriate [inherited 
methods](https://github.com/Nasdanika/server/blob/master/org.nasdanika.cdo.web/doc/application-rendering.md#renderer-methods). 

```java
/**
 * @generated
 */
public interface DiagnosticRenderer<T extends Diagnostic> extends RendererBase<T> {
    /**
     * @generated
     */
    DiagnosticRenderer<Diagnostic> INSTANCE = new DiagnosticRenderer<Diagnostic>() {
    };

    /**
     * @generated
     */
    @Override
    default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
            ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
            throws Exception {

        return new DiagnosticRenderer<T>() {

            @Override
            public ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> getMasterResourceProvider(
                    CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
                return masterResourceProvider;
            }

        };
    }

    /**
     * @generated
     */
    @Override
    default LinkedList<Class<?>> getResourceBundleClasses(
            CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
        LinkedList<Class<?>> ret = new LinkedList<>();
        ret.add(DiagnosticRenderer.class);
        ret.addAll(RendererBase.super.getResourceBundleClasses(context));
        return ret;
    }

}
```

 