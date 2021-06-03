package com.yunyi.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Desc JDK动态代理
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016年7月20日
 * <p>
 * @Version 1.0
 */
public class JdkProxy implements InvocationHandler {

    public Object target = null;

    public JdkProxy(Object target) {
        this.target = target;
    }

    public Object bind(Object target) {
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                this);
        return proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);
        return result;
    }

}
