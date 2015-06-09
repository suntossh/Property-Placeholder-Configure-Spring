package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		final ApplicationContext context = new ClassPathXmlApplicationContext("config/application-config.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		System.out.println(beanA.getPropertyA());
		System.out.println(beanA.getPropertyB());
		System.out.println(beanA.getPropertyC());
		
	}
}
