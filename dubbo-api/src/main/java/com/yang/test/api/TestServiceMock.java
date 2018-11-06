package com.yang.test.api;

/**
 * @author yangmingkai
 * @ClassName TestServiceMock
 * @Description TODO
 * @date 2018/10/25 3:15 PM
 **/
public class TestServiceMock implements TestService {

    @Override
    public String sayHello(String str) {
        return "服务被降级了";
    }
}
