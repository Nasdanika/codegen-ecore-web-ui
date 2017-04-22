# Routes

For each selected EClass the generator creates a route class and a route registration in ``plugin.xml``. 

Generated route extends the package's ``RouteBase`` and implements the corresponding 
renderer for the class.   

Route classes are intended to contain UI customizations related to request process, 
e.g. [route methods](http://www.nasdanika.org/server/apidocs/org.nasdanika.web/apidocs/org/nasdanika/web/RouteMethod.html). 

```java
/**
 * @generated
 */
public class DiagnosticRoute extends RouteBase<Diagnostic> implements DiagnosticRenderer<Diagnostic> {
    /**
     * @generated
     */
    public DiagnosticRoute() throws Exception {
        super();

    }

}
```

