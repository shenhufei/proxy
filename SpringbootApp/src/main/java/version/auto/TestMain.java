package version.auto;

import version.service.UserService;
import version.service.UserServiceImpl;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) throws Exception {
        UserServiceImpl serviceImpl = new UserServiceImpl();
        DemoProxy factory=new DemoProxy(serviceImpl);
        UserService proxy = (UserService) Proxy.newProxyInstance(serviceImpl.getClass().getClassLoader(),serviceImpl.getClass().getInterfaces(),factory);

    }
}
