package version.InvocationHandler.service;

public class UserServiceImpl implements UserService {
	@Override
	public void print() {
		//System.out.println("你大爷");
	}
	@Override
	public void doSomething(String string) {
		System.out.println(string);
	}
}
