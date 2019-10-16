package com.yunyi.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * 
 * @author Administrator
 *
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
