package lk.ijse.gdse.aad.lifecycle;

import lk.ijse.gdse.aad.di.GoodFood;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanLifeCycleExplain implements BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean {
    @Autowired
    GoodFood goodFood;


    BeanLifeCycleExplain(){
        System.out.println("Constructor");
      // System.out.println(goodFood.eat());
    }
    @PostConstruct
    public void init(){
        System.out.println("Init");
        System.out.println(goodFood.eat());
    }



    public void myMethod01(){
        System.out.println("my method01");
    }
    public void myMethod02(){
        System.out.println("my method02");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SetBeanFactory: " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Man yanoooooo");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Set application context: "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");
        System.out.println(goodFood.eat());
    }
}
