package com.alekseysavin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstructorArgsApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoce the company slogan via the bean
		org.corporateSlogann();
		
		// Print Organization details
		System.out.println(org);
		
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}