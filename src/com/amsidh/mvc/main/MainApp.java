package com.amsidh.mvc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.domain.Person;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

		Person person = context.getBean("person", Person.class);
		person.setName("Amsidh Lokhande");
		System.out.println(person.getName());

	}
}
