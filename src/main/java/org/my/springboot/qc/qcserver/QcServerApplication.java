package org.my.springboot.qc.qcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSocketMessageBroker
public class QcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QcServerApplication.class, args);
    }

}
