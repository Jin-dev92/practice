package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
@Component("console")
public class InlineExamConsole implements ExamConsole {
	@Autowired(required = false) // xml ��  ��ü�� ��� null�� ���� 
	//xml�� id�� ���ε��ؼ� �����´�.
	
	private Exam exam ;
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	

//	@Qualifier("exam2") ���⿣ ���ü�����. �����ε� �� �������� �ʵ尡 ������ �ϼ� �ֱ� ������
	public InlineExamConsole(@Qualifier("exam2")Exam exam) { // ����ʹٸ� �̷������� ���
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	public Exam getExam() {
		return exam;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
//		System.out.println((exam.total()));
//		System.out.println((exam.total()));
		if (exam == null) 
			System.out.printf("total is %d, avg is %f", 0, 0.0f);
		else
			System.out.printf("total is %d, avg is %f", exam.total(), exam.avg());
	}

	@Qualifier("exam2") 
	@Override 
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("setter");
		this.exam = exam;
	}

}
