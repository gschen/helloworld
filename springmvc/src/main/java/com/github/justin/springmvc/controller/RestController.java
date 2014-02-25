package com.github.justin.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by apple on 2/24/14.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, "test"));
    }
//    public @ResponseBody Greeting greeting(
//            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
//    }

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
}
