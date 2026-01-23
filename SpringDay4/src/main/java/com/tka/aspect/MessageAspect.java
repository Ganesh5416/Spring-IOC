package com.tka.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MessageAspect {
	@Before("execution (public void MyRecharge())")
//	public void beforeMain() {
//		System.out.println("Your Data Pack Is Expiring Soon !! Recharge Now ");
//	}
	
//	@After("execution (public void MyRecharge())")
//	public void afterRecharge() {
//		System.out.println("Enjoy Your Data Pack !!");
//	}

	@Around("execution (public void MyRechrage())")
	public void afterMain(ProceedingJoinPoint p ) {
		System.out.println("Enjoy Your Data Pack !!");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
