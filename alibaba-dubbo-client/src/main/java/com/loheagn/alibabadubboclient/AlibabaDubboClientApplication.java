package com.loheagn.alibabadubboclient;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.loheagn.HelloService;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaDubboClientApplication.class, args);
    }
    @RestController
    static class TestController {

        @Reference
        HelloService helloService;

        @GetMapping("/test")
        public String test() {
            return helloService.hello("loheagn.com");
        }
    }
}
