package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

// xml Configuation 을 java Configuration 으로 변경하기 
// https://www.youtube.com/watch?v=XzrXZIRB1vM&list=PLq8wAnVUcTFUHYMzoV2RoFoY2HDTKru3T&index=17
@ComponentScan("spring.di.ui")
@Configuration // java Configuration 선언
public class NewlecDiConfig {
	@Bean
	public Exam exam() { // 함수 명이 아니고 xml bean 의 id 명으로 봐야함
		return new NewlecExam();
	}
}
