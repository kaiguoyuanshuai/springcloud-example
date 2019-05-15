package com.zcoco.springcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2019/5/15
 */
@RestController
@RequestMapping("rest")
public class AccountConsumerRestController {


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("getAccount")
    @HystrixCommand(fallbackMethod = "hiError")
    public List<String> getAccounts() {
        return restTemplate.getForObject("http://provider/account/accounts", List.class);
    }

    public List<String> hiError() {
        List<String> lists = new ArrayList<>() ;
        lists.add("has error") ;
        System.out.println("has error");
        return lists;
    }
}
