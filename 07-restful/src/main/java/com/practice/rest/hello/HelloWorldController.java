package com.practice.rest.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello-bean")
    public HelloBean helloBean() {
        return new HelloBean("hola amigos") ;
    }

    @GetMapping("/hello-bean/path-variable/{message}")
    public HelloBean helloBeanPath(@PathVariable String message) {
        return new HelloBean(message) ;
    }
}
