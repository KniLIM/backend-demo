package com.loheagn.alibabadubboserver;

import com.loheagn.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class HelloServiceImpl implements HelloService {

    @Override
    @GetMapping("/test")
    public String hello(@RequestParam String name) {
        return "hello" + name;
    }
}
