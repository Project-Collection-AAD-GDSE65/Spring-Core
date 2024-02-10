package lk.ijse.gdse.aad.component;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//declare as a component
@Component

//change the scope as prototype
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)

//change the scope as singleton
//@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class MyComponent {
    MyComponent(){
        //System.out.println("My Component");
    }
}
