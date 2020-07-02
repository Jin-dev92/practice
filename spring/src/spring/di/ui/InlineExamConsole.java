package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
@Component("console")
public class InlineExamConsole implements ExamConsole {
	@Autowired(required = false) // xml 에  객체가 없어도 null로 진행 
	//xml의 id로 바인딩해서 가져온다.
	
	private Exam exam ;
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	

//	@Qualifier("exam2") 여기엔 들어올수없음. 오버로드 된 생성자의 필드가 여러개 일수 있기 때문에
	public InlineExamConsole(@Qualifier("exam2")Exam exam) { // 쓰고싶다면 이런식으로 사용
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
