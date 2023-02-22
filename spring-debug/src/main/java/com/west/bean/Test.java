package com.west.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.west.bean")
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new MyClassPathXmlApplicationContext("classpath:beans.xml");
		User user = context.getBean(User.class);
		System.out.println(user.getName());
		System.out.println(context.getEnvironment().getProperty("name"));

		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	}
}
