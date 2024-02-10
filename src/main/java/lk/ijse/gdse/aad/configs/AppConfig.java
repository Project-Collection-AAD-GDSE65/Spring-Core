package lk.ijse.gdse.aad.configs;

import lk.ijse.gdse.aad.bean.MyBean;
import lk.ijse.gdse.aad.component.Timer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

//config class with component scan
@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad")
//@EnableScheduling
public class AppConfig {
    //declare as a bean
    @Bean("test")
    //change the scope as singleton
    //@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)

    //change the scope as prototype

    public MyBean bean(){
        return new MyBean();
    }
//    @Bean
//    public ThreadPoolTaskScheduler taskScheduler() {
//        return new ThreadPoolTaskScheduler();
//    }
}
