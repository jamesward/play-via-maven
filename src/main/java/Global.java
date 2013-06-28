import org.pk11.jaxrs.Router;
import play.Application;
import play.GlobalSettings;
import play.api.mvc.Handler;
import play.mvc.Http;

public class Global extends GlobalSettings {
    
    @Override
    public Handler onRouteRequest(Http.RequestHeader requestHeader) {
        return Router.handlerFor(this, requestHeader);
    }
    
}
