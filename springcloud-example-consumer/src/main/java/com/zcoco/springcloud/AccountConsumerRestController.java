package com.zcoco.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    public List<String> getAccounts() {
        return restTemplate.getForObject("http://provider/account/accounts", List.class);
    }

}
