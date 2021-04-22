package example.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import example.domain.User;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

import java.io.IOException;
import java.nio.charset.Charset;

public class TestHandler implements Handler<RoutingContext> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void handle(RoutingContext ctx) {

        String id = ctx.pathParam("id");

        // This handler will be called for every request
        HttpServerResponse response = ctx.response();

        // JsonObject jsonObject = ctx.getBodyAsJson();
        User user  = new User(id, "test", "123456");
        //return resp;
        response.putHeader(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
        try {
            response.end(toJson(user));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            response.setStatusCode(500);
            response.end("{\"error\": \"JsonProcessingException\"}");
        }

    }

    private String toJson(User object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    private User fromJson(String json) throws IOException {
        return objectMapper.readValue(json.getBytes(Charset.forName("UTF-8")), User.class);
    }
}
