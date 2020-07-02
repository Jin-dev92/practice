package spring.di.ui;

import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public interface ExamConsole {
	void print();

	void setExam(Exam exam);

//	void setExam(Exam exam);
	
}
