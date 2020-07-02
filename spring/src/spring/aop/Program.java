package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {
	// aop 란 ? - 관점 지향 프로그래밍 횡단 관심사의 분리를 허용함으로써 모듈성을 증가 시키는 것이 목적인 프로그래밍
	// 실제 업무를 시행하는 Core Concern 
	// 잘라내도 되는 Cross - cutting Cocern - 프록시 클래스에 구현
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("avg is %f\n",proxy.avg());
		
		/* 자바로 aop 구현하기.
		Exam exam = new NewlecExam(1,1,1,1);
		Exam proxy = (Exam)Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, // 여러 클래스가 들어갈 수 있다.
				new InvocationHandler() {
					// 곁다리 보조 코드
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { // 실제 업무 작성
						// TODO Auto-generated method stub
						long start = System.currentTimeMillis();
						Object result = method.invoke(exam	, args);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						long end = System.currentTimeMillis(); // 현재 시간 불러오는 메소드
						String message = (end - start) + " ms 시간 걸렸습니다.";
						System.out.println(message);
						return result;
					}
				});
		
		System.out.printf("total is %d\n",proxy.total());
		*/
		
	}
}
