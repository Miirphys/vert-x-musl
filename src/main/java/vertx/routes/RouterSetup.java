package vertx.routes;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import vertx.handlers.ping.PingRequestHandler;
import vertx.handlers.pong.PongRequestHandler;

public class RouterSetup {

  private final PingRequestHandler pingRequestHandler;

  private final PongRequestHandler pongRequestHandler;

  public RouterSetup() {

    this.pingRequestHandler = new PingRequestHandler();

    this.pongRequestHandler = new PongRequestHandler();

  }

  public Router setupRouter(Vertx vertx) {

    Router router = Router.router(vertx);

    router.get("/ping").handler(pingRequestHandler);

    router.get("/pong").handler(pongRequestHandler);

    return router;

  }

}

