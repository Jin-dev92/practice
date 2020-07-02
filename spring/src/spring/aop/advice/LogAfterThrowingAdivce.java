package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdivce implements ThrowsAdvice{ // ���� �߻� �� ����Ǵ� �����̽�  
	// beforeAdvice ���� �� ������ ���� ������ AfterReturning���� �� 
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("���� �߻� :"+ e.getMessage());
	}
}
