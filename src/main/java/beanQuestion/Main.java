package beanQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// A Bean has 5 stages in its life cycle
			// i) Does not exist phase - Bean has not been loaded in the memory
			// ii) Instantiation phase - Bean gets loaded in the memory and all the 
					// dependencies are loaded
			// iii) Initialization Phase - Bean has been created and it calls the Init-method
			// iv) Service Phase - The reference of the bean is provided to the user
			//	   at this point and it can provide its services.
			// v)  Destruction Phase - When our spring container is shut down (using close()) method
			// 	   the destroy-method (if provided) will be called just before the operations of the
			//	   garbage collector
		
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			Adventure adventure = context.getBean("adventure", Adventure.class);
			adventure.start();
			((ClassPathXmlApplicationContext)context).close();
	}	

}
