package com.github.justin.springshell.client;

import org.springframework.shell.Bootstrap;

import java.io.IOException;

/**
 * Created by apple on 2/25/14.
 */
public class Application {
    public static void main(String[] args) {
        try {
            Bootstrap.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
