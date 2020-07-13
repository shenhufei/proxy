package springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import version.InvocationHandler.DemoProxy;
import version.InvocationHandler.service.UserService;
import version.InvocationHandler.service.UserServiceImpl;

import java.lang.reflect.Proxy;

@RestController
public class mainController {
	
	@RequestMapping("/home")
	public String message() {
		UserServiceImpl serviceImpl = new UserServiceImpl();
		DemoProxy factory=new DemoProxy(serviceImpl);
		UserService proxy = (UserService) Proxy.newProxyInstance(serviceImpl.getClass().getClassLoader(),serviceImpl.getClass().getInterfaces(),factory);
		//System.out.println("==");
		//proxy.print();
		proxy.doSomething("123123");
		return "BAM!";
	}

}
