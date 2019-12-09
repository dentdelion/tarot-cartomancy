package com.blyumska.tarot.fortune.teller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FortuneTellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortuneTellerApplication.class, args);
    }

}
