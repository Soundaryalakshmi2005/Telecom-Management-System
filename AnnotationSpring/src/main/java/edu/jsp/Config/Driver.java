package edu.jsp.Config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=new AnnotationConfigApplicationContext("Config.class");
		Student s=(Student)con.getBean("sheela");
		s.play();
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(s.getClass());
		con.close();
	}

}
