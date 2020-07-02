package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam ;
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
//		System.out.print(exam.total()+"+"+exam.avg());
	}
	
	public void setExam(Exam exam) {
		
	}

}
