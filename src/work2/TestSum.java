package work2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSum {

	public static void main(String[] args) {
		String xmlPath = "work2/beanSum.xml";
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext(xmlPath);
		asumb thesum = (asumb)applicationContext.getBean("asumb");
		System.out.println("The sum = " + thesum.sum);

	}

}
