package com.rans.demosite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemositeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemositeApplication.class, args);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
