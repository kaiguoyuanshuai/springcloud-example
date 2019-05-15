package com.zcoco.springcloud.api;

import com.zcoco.springcloud.api.fallback.AccountServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2019/5/15
 */
@FeignClient(name = "provider" ,fallback = AccountServiceHystric.class)
public interface AccountService {

    @RequestMapping(method = RequestMethod.GET, value = "/account/accounts")
    List<String> accounts();
}
