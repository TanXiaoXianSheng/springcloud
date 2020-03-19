package cn.bcf.example.springcloud.cluster.serviceuser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/getPort",method = RequestMethod.GET)
    public String getPort(){
        return "Hello,my port is " + port;
    }
}
