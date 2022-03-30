package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	Employee e1 = ctx.getBean("emp", Employee.class);
    	Employee e2 = ctx.getBean("emp", Employee.class);
    	Employee e3 = ctx.getBean("emp", Employee.class);
    	Employee e4 = ctx.getBean("emp", Employee.class);
    	Employee e5 = ctx.getBean("emp", Employee.class);
    }
}
