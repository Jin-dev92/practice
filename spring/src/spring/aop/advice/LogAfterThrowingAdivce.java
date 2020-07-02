package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdivce implements ThrowsAdvice{ // 오류 발생 시 실행되는 어드바이스  
	// beforeAdvice 실행 후 오류가 나지 않으면 AfterReturning으로 감 
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외 발생 :"+ e.getMessage());
	}
}
