package com.zcoco.springcloud;

import com.zcoco.springcloud.api.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2019/5/15
 */
@RestController
@RequestMapping("feign")
public class AccountConsumerFeignController {


    @Autowired
    AccountService accountService;

    @RequestMapping("getAccount")
    public List<String> getAccounts() {
        return accountService.accounts();
    }

}
