package com.github.justin.springmvc.controller;

/**
 * Created by apple on 2/24/14.
 */
public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.content = content;
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
