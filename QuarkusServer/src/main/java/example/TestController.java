package example;

import example.domain.User;
import org.jboss.resteasy.annotations.jaxrs.PathParam;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value = "/api")
public class TestController {

    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/user/{id}")
    public User getUser(@PathParam("id") String id) {
        // 注意: @PathParam("id")注解必须带上路径变量名称，否则解析不到， 这里面应该是框架存在BUG
        User resp = null;
        resp = new User(id, "test", "123456");
        return resp;
    }
}
