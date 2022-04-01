package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Question;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	Question qu = ctx.getBean("que", Question.class);
    	
    	System.out.println("Question Id : " + qu.getId());
    	System.out.println("Question Title : " + qu.getTitle());
    	System.out.println("\tAnswer Id : " + qu.getAns().getId());
    	System.out.println("\tAnswer Desc : " + qu.getAns().getDesc());
    			
    			
    }
}
