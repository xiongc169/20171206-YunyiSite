package com.yunyi.service.proxy;

import java.lang.reflect.Method;

import com.yunyi.domain.wong_user.Account;
import org.springframework.cglib.beans.BeanGenerator;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @Desc CGlib动态代理
 * http://blog.csdn.net/yakoo5/article/details/9099133/
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016年7月20日
 * <p>
 * @Version 1.0
 */
public class CGlibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    private BeanGenerator generator = new BeanGenerator();

    public CGlibProxy() {
    }

    public Object getProxy(Class clazz) {
        // enhancer.setSuperclass(clazz);
        // enhancer.setCallback(this);
        // Object obj = enhancer.create();
        // return obj;

        generator.setSuperclass(clazz);
        generator.addProperty("employeeDao", Account.class);
        Object obj = generator.create();
        return obj;
    }

    public Object intercept(Object obj, Method arg1, Object[] arg2, MethodProxy methodProxy) throws Throwable {

        System.out.println("This is before CGlibProxy.intercept()");

        Object result = methodProxy.invokeSuper(obj, arg2);

        System.out.println("This is after CGlibProxy.intercept()");
        return result;
    }

}
