package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/* ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam);
		*/
//		Exam exam = new NewlecExam();
//		ApplicationContext Di ��ħ���� ���� �߰��ϴ� Ŭ����
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDiConfig.class);
//		ExamConsole console = (ExamConsole)context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		console.print();
		
//		java.util.List<Exam> exams = (List<Exam>) context.getBean("exams");
//				//new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
//		for (Exam e : exams) {
//			System.out.println(e);
//			
//		}
		
		// ������̼� ���Ǳ� ������� 2
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(NewlecDiConfig.class);
//		ctx.refresh();
//		ExamConsole console = (ExamConsole)ctx.getBean("console");
//		console.print();
		
		
	}

}
