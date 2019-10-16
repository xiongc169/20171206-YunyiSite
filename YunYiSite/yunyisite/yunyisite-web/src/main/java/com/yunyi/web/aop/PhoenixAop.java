package com.yunyi.web.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PhoenixAop {

	public PhoenixAop() {
		System.out.println("This is PhoenixAop Constructor");
	}

	@Pointcut("execution(* org.yoong.web.controller.controller.*())")
	public void anyMethod() {
	}

	@Before(value = "anyMethod()")
	public void BeforeAdvice() throws Exception {
		System.out.println("This is PhoenixAop BeforeAdvice");
	}

	@AfterReturning(value = "anyMethod()")
	public void AfterReturningAdvice() throws Exception {
		System.out.println("This is PhoenixAop AfterReturningAdvice");
	}

	@AfterThrowing(value = "anyMethod()")
	public void AfterThrowingAdvice() throws Exception {
		System.out.println("This is PhoenixAop AfterThrowingAdvice");
	}

	@After(value = "anyMethod()")
	public void AfterAdvice() throws Exception {
		System.out.println("This is PhoenixAop AfterAdvice");
	}

	@Around(value = "anyMethod()")
	public void AroundAdvice() throws Exception {
		System.out.println("This is PhoenixAop AroundAdvice");
	}

}
