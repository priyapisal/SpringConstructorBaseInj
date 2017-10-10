package com.scp.spring.SpringConstructorBaseInj;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
	  
	public class Main {  
	    public static void main(String[] args) {  
	          
	        Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee s=(Employee)factory.getBean("e");  
	        s.show();  
	          
	    }  
	}    
	         
