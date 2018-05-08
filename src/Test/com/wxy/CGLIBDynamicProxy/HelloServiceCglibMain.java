package com.wxy.CGLIBDynamicProxy;

import com.wxy.mybatisTest.JDKDynamicProxy.HelloService;
import com.wxy.mybatisTest.JDKDynamicProxy.HelloServiceImpl;

/**
 * Created by Cser_W on 2018/5/6.
 */
public class HelloServiceCglibMain {
    public static void main(String[] args){
        HelloServiceImpl helloService = new HelloServiceImpl();
        HelloServiceCglib helloServiceCglib = new HelloServiceCglib();
        HelloService instance = (HelloService) helloServiceCglib.getInstance(helloService);
        instance.sayHello("cglib");

    }
}
