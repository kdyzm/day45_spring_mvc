package com.kdyzm.spring.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ≤‚ ‘¿‡
 */
public class PersonTest {
	public static void main(String[] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext("com/kdyzm/spring/mvc/applicationContext.xml");
		PersonAction personAction=(PersonAction) context.getBean("personAction");
		personAction.savePerson();
	}
	
}
