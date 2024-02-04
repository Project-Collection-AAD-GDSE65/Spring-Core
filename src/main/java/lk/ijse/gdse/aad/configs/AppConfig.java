package lk.ijse.gdse.aad.configs;

import lk.ijse.gdse.aad.bean.MyBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//config class with component scan
@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad.component")
public class AppConfig {
    //declare as a bean
    @Bean
    //change the scope as singleton
    //@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)

    //change the scope as prototype
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public MyBean bean(){
        return new MyBean();
    }
}
