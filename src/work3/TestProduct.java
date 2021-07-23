package work3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {
	public static void main(String[] args) {
		// 定义配置文件路径
		String xmlPath = "work3/BeanProduct.xml";
		// 加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// 设值方式输出结果
		System.out.println(applicationContext.getBean("testProduct"));
	}
}
