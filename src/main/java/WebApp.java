import play.api.Mode;
import play.core.StaticApplication;
import play.core.server.NettyServer;
import scala.Option;

import java.io.File;

public class WebApp {
    
    public static void main(String[] args) throws Exception {
        new NettyServer(new StaticApplication(new File(".")), 9000, Option.apply(null), "0.0.0.0", Mode.Dev());
    }
    
}