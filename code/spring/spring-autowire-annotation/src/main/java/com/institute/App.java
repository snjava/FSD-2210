package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.institute.bean.Employee;
import com.institute.bean.Student;
import com.institute.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Student st = ctx.getBean("stud", Student.class);
    	System.out.println(st.getAdd().city);
    	System.out.println(st.getAdd().state);
    	
    	System.out.println("=======EMployee========");
    	Employee emp = ctx.getBean(Employee.class);
    	System.out.println(emp.getAdd().city);
    	System.out.println(emp.getAdd().state);
    }
}
