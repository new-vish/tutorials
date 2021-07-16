package spring.tutorials.first.spring.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import spring.tutorials.first.spring.Student;
  
public class Test {
	
	public void Test() {
		
	}
	
	public static void main(String[] args) throws IOException {
		
		InputStream inputStream = 
				Test.class.getResourceAsStream("/applicationContext.xml");
		if (inputStream == null)
		{
			System.out.println("Input Stream is null");
			return;
		}		
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml"); 
		Student student = (Student) context.getBean("StudentBean");      
		student.displayInfo();
		context.close();
		
	}  
}  