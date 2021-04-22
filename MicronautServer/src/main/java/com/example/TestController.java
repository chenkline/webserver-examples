package com.example;

import com.example.domain.User;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller(value = "/api")
public class TestController {

    @Get(value = "/user/{id}", produces = "application/json; charset=UTF-8")
    public User getUser(@PathVariable String id) {
        User resp = null;
        resp = new User(id, "test", "123456");
        return resp;
    }
}
