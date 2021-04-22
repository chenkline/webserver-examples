package example;

import example.handler.TestHandler;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;

public class TestVerticle extends AbstractVerticle {

    public void start() throws Exception {
        HttpServer server = vertx.createHttpServer();

        Router router = Router.router(vertx);

        router.route(HttpMethod.GET, "/api/user/:id")
                //.consumes("application/json; charset=utf-8")
                .produces("application/json; charset=utf-8")
                .handler(new TestHandler());

        server.requestHandler(router).listen(8080);
    }

    public void stop() throws Exception {
    }

}
