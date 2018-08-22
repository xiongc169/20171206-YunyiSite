package org.yunyisite.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut("execution(* *.add*())")
	public void addMethod() {
	}

	public LogAspect() {
		System.out.println("LogAspect.LogAspect");
	}

	@Before("addMethod()")
	public void beforeAdvice() {
		System.out.println("LogAspect.beforeAdvice");
	}

	@After("addMethod()")
	public void afterAdvice() {
		System.out.println("LogAspect.afterAdvice");
	}

	@AfterReturning("addMethod()")
	public void afterReturningAdvice() {
		System.out.println("LogAspect.afterReturningAdvice");
	}

	@AfterThrowing("addMethod()")
	public void afterThrowingAdvice() {
		System.out.println("LogAspect.afterThrowingAdvice");
	}

	@Around("addMethod()")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) {
		try {
			Object[] args = joinPoint.getArgs();
			System.out.println("LogAspect.aroundAdvice" + args.length);
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
