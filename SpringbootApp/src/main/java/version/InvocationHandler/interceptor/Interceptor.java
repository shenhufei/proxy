package version.InvocationHandler.interceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Interceptor {
    // 在 action 之前调用
    public void before(Object proxy, Method method, Object[] args, Object target) throws InvocationTargetException, IllegalAccessException {
        Object obj = method.invoke(target,args);
        System.out.println("---");
       // System.out.println("在拦截器 InterceptorClass 中调用方法: before()");
    }

    // 在 action 之后调用
    public void after(){

        //System.out.println("在拦截器 InterceptorClass 中调用方法: after()");
    }
}
