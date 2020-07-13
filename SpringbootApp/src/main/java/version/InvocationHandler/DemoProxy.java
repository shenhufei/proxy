package version.InvocationHandler;

import version.InvocationHandler.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DemoProxy implements InvocationHandler{
	private Object target;
    // 创建拦截器
    private Interceptor interceptor = new Interceptor();
    public DemoProxy(Object target) {
        this.target = target;
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        interceptor.before(proxy,method,args,target);
        Object obj = method.invoke(target,args);
        interceptor.after();
        return obj;
    }

}
