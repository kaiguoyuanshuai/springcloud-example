package com.zcoco.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2019/5/15
 */
@RestController
@RequestMapping("/account/")
public class AccountServiceController {

    @Value("${server.port}")
    String serverPort ;

    @RequestMapping(method = RequestMethod.GET, value = "/accounts")
    public List<String> accounts() {
        List<String> accountLists = new ArrayList<>();
        accountLists.add("zcoco");
        accountLists.add("huang");
        accountLists.add(serverPort);
        return accountLists;
    }
}
