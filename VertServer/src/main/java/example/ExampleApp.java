package example;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;

import java.io.IOException;

public class ExampleApp {
    public static void main(String[] args) throws IOException {
        //Vertx.vertx().deployVerticle(new TestVerticle());

        //DeploymentOptions deploymentOptions = new DeploymentOptions().setInstances(2);
        //Vertx.vertx().deployVerticle(TestVerticle.class, deploymentOptions);

        WebClient client = WebClient.create(Vertx.vertx());

        // Send a GET request
        client
                .get(8080, "172.30.2.85", "/api/user/1234")
                .send()
                .onSuccess(response -> System.out
                        .println("Received response with status code" + response.statusCode()))
                .onFailure(err ->
                        System.out.println("Something went wrong " + err.getMessage()));
    }
}
