package com.saeg.ssr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public static class Item {
        private String hawbid;
        private String name;

        public Item(String hawbid, String name) {
            this.hawbid = hawbid;
            this.name = name;
        }

        // getters and setters
    }
}