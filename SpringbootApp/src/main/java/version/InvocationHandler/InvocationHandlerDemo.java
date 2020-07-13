package version.InvocationHandler;

import version.InvocationHandler.service.UserService;
import version.InvocationHandler.service.UserServiceImpl;

import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {

	public static void main(String[] args) {
		UserServiceImpl serviceImpl = new UserServiceImpl();
		DemoProxy factory=new DemoProxy(serviceImpl);
		UserService proxy = (UserService) Proxy.newProxyInstance(serviceImpl.getClass().getClassLoader(),serviceImpl.getClass().getInterfaces(),factory);
		//System.out.println("==");
		//proxy.print();
		proxy.doSomething("123123");
	}

}
