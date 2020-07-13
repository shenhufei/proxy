package springboot.auto;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class MyFactoryBean  implements FactoryBean {
    Class aclass;
    public MyFactoryBean(Class aclass){
        this.aclass=aclass;
    }
    @Override
    public Object getObject() throws Exception {
        Class[] aclzz = new Class[]{aclass};
        Object  object= Proxy.newProxyInstance(MyFactoryBean.class.getClassLoader(),aclzz,new MyInvokeHandler());
        return object;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    public Class getAclass() {
        return aclass;
    }

    public void setAclass(Class aclass) {
        this.aclass = aclass;
    }
}
