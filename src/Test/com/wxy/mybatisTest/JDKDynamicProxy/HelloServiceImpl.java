package com.wxy.mybatisTest.JDKDynamicProxy;

/**
 * Created by Cser_W on 2018/5/6.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.err.println("hello "+ name);
    }
}
