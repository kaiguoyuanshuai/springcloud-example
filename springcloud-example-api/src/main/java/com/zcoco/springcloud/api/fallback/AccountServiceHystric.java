package com.zcoco.springcloud.api.fallback;

import com.zcoco.springcloud.api.AccountService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2019/5/15
 */
@Component
public class AccountServiceHystric implements AccountService {
    @Override
    public List<String> accounts() {
        List<String> lists = new ArrayList<>();
        lists.add("has error");
        System.out.println("has error");
        return lists;
    }
}
