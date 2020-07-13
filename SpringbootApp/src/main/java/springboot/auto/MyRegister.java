package springboot.auto;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class MyRegister  implements ImportBeanDefinitionRegistrar {
    public static List<String> list = new ArrayList<>();

    static{
        list.add("springboot.dao.MyDao");
        list.add("springboot.dao.MyDao2");
        list.add("springboot.dao.MyDao3");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        for (int i = 0;i<list.size();i++){
            BeanDefinitionBuilder beanBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);
            AbstractBeanDefinition beanDefinition = beanBuilder.getBeanDefinition();
            String className = list.get(i);
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(className);
            String[] split = className.split("\\.");
            registry.registerBeanDefinition(split[split.length-1],beanDefinition);
        }

    }

}
