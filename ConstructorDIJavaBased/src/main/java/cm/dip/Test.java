package cm.dip;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.refresh();
		Student stu = context.getBean("student",Student.class);
		System.out.println(stu);
	}

}
