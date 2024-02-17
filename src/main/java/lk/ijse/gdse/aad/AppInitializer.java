package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.configs.AppConfig;
import lk.ijse.gdse.aad.dao_demo_AOP.DataProcess;
import lk.ijse.gdse.aad.inject.Car;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        //Create the context
        var ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
       // get a bean from the context
        var myComponent = ctx.getBean("test");

        //Get the bean of DataProcess and call the included methods - AOP
        var dataProcess = ctx.getBean(DataProcess.class);
        dataProcess.dataProcessStarted();
        dataProcess.dataProcessEnd();

        //Get the bean of Car and call the included methods - DI
        var car = ctx.getBean(Car.class);
        System.out.println(car.run());


        //Check either the bean is singleton or not
        ConfigurableListableBeanFactory
                beanFactory = ctx.getBeanFactory();
        boolean isSingleton = beanFactory.isSingleton("test");
        //System.out.println(isSingleton);

        ctx.registerShutdownHook();

    }
}
