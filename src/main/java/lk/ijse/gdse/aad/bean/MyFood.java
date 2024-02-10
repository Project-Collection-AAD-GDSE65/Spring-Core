package lk.ijse.gdse.aad.bean;

import lk.ijse.gdse.aad.di.GoodFood;
import org.springframework.stereotype.Component;
@Component
public class MyFood implements GoodFood {
    @Override
    public String eat() {
       return "Eat rice";
    }
}
