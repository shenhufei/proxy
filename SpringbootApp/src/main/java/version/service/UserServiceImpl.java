package version.service;

public class UserServiceImpl implements UserService{
    @Override
    public void getString(String name) {
        System.out.println(name);
    }

    @Override
    public void doSomething(String string) {
        System.out.println(string);
    }
}
