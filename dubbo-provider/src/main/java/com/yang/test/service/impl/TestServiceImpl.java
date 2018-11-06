package com.yang.test.service.impl;

import com.yang.test.api.TestService;
import org.springframework.stereotype.Service;

/**
 * @author yangmingkai
 * @ClassName TestServiceImpl
 * @Description TODO
 * @date 2018/10/22 4:50 PM
 **/
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String str) {
        return str;
    }
}
