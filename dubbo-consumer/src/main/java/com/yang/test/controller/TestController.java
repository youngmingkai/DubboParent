package com.yang.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.yang.test.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author yangmingkai
 * @ClassName TestController
 * @Description TODO
 * @date 2018/10/22 4:55 PM
 **/
@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public String hello() throws Exception{
        return testService.sayHello("Hello springboot-dubbo!");
    }
//
//    @RequestMapping("test")
//    public String hello() throws Exception{
//        testService.sayHello("Hello springboot-dubbo!");
//        //拿到future引用
//        Future<String> future = RpcContext.getContext().getFuture();
//        //如果已返回，则直接拿到返回值，否则线程等待（wait），直到拿到返回值，线程才会被唤醒（notify）
//        String result = future.get();
//        return result;
//    }
}
