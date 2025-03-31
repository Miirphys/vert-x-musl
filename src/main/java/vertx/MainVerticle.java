package vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import vertx.routes.RouterSetup;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {

    HttpServer server = vertx.createHttpServer();

    RouterSetup routerSetup = new RouterSetup();

    server.requestHandler(routerSetup.setupRouter(vertx));

    server.listen(8080);

  }

}
