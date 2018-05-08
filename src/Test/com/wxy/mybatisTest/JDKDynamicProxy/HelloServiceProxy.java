package com.wxy.mybatisTest.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Cser_W on 2018/5/6.
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object object;

    public Object bind(Object o){
        this.object = o;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("我是jdk动态代理");
        Object result = null;
        System.err.println("我准备说hello");
        result = method.invoke(object, args);
        System.err.println("我说过hello了");
        return result;
    }
}
