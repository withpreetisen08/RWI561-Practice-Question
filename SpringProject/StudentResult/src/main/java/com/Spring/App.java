package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

	    ApplicationContext context = new ClassPathXmlApplicationContext("SPconfig.xml");
	    Student s1 = (Student) context.getBean("std");
	    s1.print();
    }
}
