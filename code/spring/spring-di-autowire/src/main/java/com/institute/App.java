package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Employee;
import com.institute.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	Employee e = ctx.getBean("emp", Employee.class);
    	
    	System.out.println("========Employee Info=============");
    	System.out.println("Id : " + e.getId());
    	System.out.println("Name : " + e.getName());
    	System.out.println("City : " + e.getAddr().getCity());
    	System.out.println("Country : " + e.getAddr().getCountry());
    	System.out.println("Edu Title : " + e.getHigherEdu().getTitle());
    	System.out.println("Edu Percent : " + e.getHigherEdu().getPercent());
    	
    	Student s = ctx.getBean("stud", Student.class);
    	System.out.println("========Student Info=============");
    	System.out.println("Id : " + s.getId());
    	System.out.println("Name : " + s.getName());
    	System.out.println("City : " + s.getAdd().getCity());
    	System.out.println("Country : " + s.getAdd().getCountry());
    	System.out.println("Edu Title : " + s.getEdu().getTitle());
    	System.out.println("Edu Percent : " + s.getEdu().getPercent());
    	
    	
    	
    	Employee e1 = ctx.getBean("emp1", Employee.class);
    	
    	System.out.println("========Employee 1 Info=============");
    	System.out.println("Id : " + e1.getId());
    	System.out.println("Name : " + e1.getName());
    	System.out.println("City : " + e1.getAddr().getCity());
    	System.out.println("Country : " + e1.getAddr().getCountry());
    	System.out.println("Edu Title : " + e1.getHigherEdu().getTitle());
    	System.out.println("Edu Percent : " + e1.getHigherEdu().getPercent());
    }
    
    
    
}
