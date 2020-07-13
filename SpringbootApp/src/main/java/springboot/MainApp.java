package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.auto.Config;
import springboot.dao.MyDao;
import springboot.dao.MyDao2;
import springboot.dao.MyDao3;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("=======");
		MyDao myDao =(MyDao) context.getBean("MyDao");
		myDao.getSomeThing();
		MyDao2 myDao2 =(MyDao2) context.getBean("MyDao2");
		myDao2.getSomeThing();
		MyDao3 myDao3 =(MyDao3) context.getBean("MyDao3");
		myDao3.getSomeThing();
	}

}
