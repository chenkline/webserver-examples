package example;

import example.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @GetMapping(value = "/user/{id}", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public User getUser(@PathVariable(value = "id") String id) {
        User resp = null;
        resp = new User(id, "test", "123456");
        return resp;
    }
}
