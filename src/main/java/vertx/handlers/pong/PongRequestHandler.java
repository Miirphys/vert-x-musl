package vertx.handlers.pong;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

import java.util.logging.Logger;

public class PongRequestHandler implements Handler<RoutingContext> {

  private final Logger logger = Logger.getLogger(PongRequestHandler.class.getName());

  @Override
  public void handle(RoutingContext routingContext) {

    logger.info(Messages.PONG_SUCCESSFULLY_LAUNCHED_ON_HTTP_LOCALHOST_8080);

    routingContext.response()
      .putHeader("content-type", "text/plain")
      .end("Hey , PONG!");

  }
}
