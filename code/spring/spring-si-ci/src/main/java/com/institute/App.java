package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	Student st = ctx.getBean("stud", Student.class);
    	
    	System.out.println("Student Info=====");
    	System.out.println("Id : " + st.getId());
    	System.out.println("Name : " + st.getName());
    	System.out.println("Contact : ");
    	String contact[] =st.getContact();
    	for (String ct : contact) {
			System.out.println(ct);
		}
    	
    	
    	Employee e = ctx.getBean("emp", Employee.class);
    	System.out.println("Employee Info=====");
    	System.out.println("Id : " + e.getId());
    	System.out.println("Name : " + e.getName());
    	System.out.println("Contact : ");
    	contact =e.getContact();
    	for (String ct : contact) {
			System.out.println(ct);
		}
    	
    }
}
