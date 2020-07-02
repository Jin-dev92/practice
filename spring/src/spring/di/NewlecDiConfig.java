package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

// xml Configuation �� java Configuration ���� �����ϱ� 
// https://www.youtube.com/watch?v=XzrXZIRB1vM&list=PLq8wAnVUcTFUHYMzoV2RoFoY2HDTKru3T&index=17
@ComponentScan("spring.di.ui")
@Configuration // java Configuration ����
public class NewlecDiConfig {
	@Bean
	public Exam exam() { // �Լ� ���� �ƴϰ� xml bean �� id ������ ������
		return new NewlecExam();
	}
}
