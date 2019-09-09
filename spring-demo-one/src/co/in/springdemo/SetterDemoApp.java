package co.in.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("ApplicationContext1.xml");
				 		
		// retrieve bran from spring container
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean 
		
		// ... let's come back to this
		
		
		  System.out.println(theCoach.getDailyWorkout());
		  
		  System.out.println(theCoach.getDailyFortune());
		  
		  // call our new method to get the literal values
		  
		  System.out.println(theCoach.getEmailAddress());
		  
		  System.out.println(theCoach.getTeam());
		 
		// close the context
		context.close();

	}

}
