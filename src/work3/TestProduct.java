package work3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {
	public static void main(String[] args) {
		// ���������ļ�·��
		String xmlPath = "work3/BeanProduct.xml";
		// ���������ļ�
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// ��ֵ��ʽ������
		System.out.println(applicationContext.getBean("testProduct"));
	}
}
