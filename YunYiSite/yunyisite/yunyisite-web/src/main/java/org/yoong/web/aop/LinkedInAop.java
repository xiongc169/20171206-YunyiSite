package org.yoong.web.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LinkedInAop {

	@Pointcut("execution(* org.yoong.web.controller.controller.*.*())")
	public void query() {

	}

	public LinkedInAop() {
		System.out.println("LinkedInAop Constructor");
	}

	@Before(value = "query()")
	public void QueryAdvice() {
		System.out.println("LinkedInAop QueryAdvice");
	}
}
