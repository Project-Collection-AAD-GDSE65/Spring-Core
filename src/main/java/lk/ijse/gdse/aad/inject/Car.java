package lk.ijse.gdse.aad.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
    private Engine engine;

    //setter injection
    @Autowired
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String run(){
       return engine.v12();
    }
}
