package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {
	// aop �� ? - ���� ���� ���α׷��� Ⱦ�� ���ɻ��� �и��� ��������ν� ��⼺�� ���� ��Ű�� ���� ������ ���α׷���
	// ���� ������ �����ϴ� Core Concern 
	// �߶󳻵� �Ǵ� Cross - cutting Cocern - ���Ͻ� Ŭ������ ����
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("avg is %f\n",proxy.avg());
		
		/* �ڹٷ� aop �����ϱ�.
		Exam exam = new NewlecExam(1,1,1,1);
		Exam proxy = (Exam)Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, // ���� Ŭ������ �� �� �ִ�.
				new InvocationHandler() {
					// ��ٸ� ���� �ڵ�
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { // ���� ���� �ۼ�
						// TODO Auto-generated method stub
						long start = System.currentTimeMillis();
						Object result = method.invoke(exam	, args);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						long end = System.currentTimeMillis(); // ���� �ð� �ҷ����� �޼ҵ�
						String message = (end - start) + " ms �ð� �ɷȽ��ϴ�.";
						System.out.println(message);
						return result;
					}
				});
		
		System.out.printf("total is %d\n",proxy.total());
		*/
		
	}
}
