package cn.bcf.example.springcloud.cluster.serviceuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getPort",method = RequestMethod.GET)
    public String getPort(){
        return restTemplate.getForEntity("http://service-user/getPort",String.class).getBody();
    }
}
