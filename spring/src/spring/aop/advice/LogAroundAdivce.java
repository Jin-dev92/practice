package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdivce implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Object result = invocation.proceed();
		long end = System.currentTimeMillis(); // 현재 시간 불러오는 메소드
		String message = (end - start) + " ms 시간 걸렸습니다.";
		System.out.println(message);
		return result;
	}
	
}
