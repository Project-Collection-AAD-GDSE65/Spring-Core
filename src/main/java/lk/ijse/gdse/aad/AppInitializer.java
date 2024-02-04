package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.configs.AppConfig;
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
        var myComponent = ctx.getBean("bean");
        System.out.println(myComponent);

        //Check either the bean is singleton or not
        ConfigurableListableBeanFactory
                beanFactory = ctx.getBeanFactory();
        boolean isSingleton = beanFactory.isSingleton("bean");
        System.out.println(isSingleton);

        ctx.close();

    }
}
