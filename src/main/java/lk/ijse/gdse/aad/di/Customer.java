package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Customer {

    @Autowired
    @Qualifier("Milk")
    @Delicious
    FavFood favFood;

    @PostConstruct
    void init(){
        favFood.balance();
    }

}
