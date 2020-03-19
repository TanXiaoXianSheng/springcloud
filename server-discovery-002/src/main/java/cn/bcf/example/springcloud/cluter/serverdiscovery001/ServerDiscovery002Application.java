package cn.bcf.example.springcloud.cluter.serverdiscovery001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerDiscovery002Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerDiscovery002Application.class, args);
    }

}
