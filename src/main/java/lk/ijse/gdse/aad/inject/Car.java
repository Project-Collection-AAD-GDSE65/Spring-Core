package lk.ijse.gdse.aad.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
    //field injection
    @Autowired
    private Engine engine;

    public String run(){
       return engine.v12();
    }
}
