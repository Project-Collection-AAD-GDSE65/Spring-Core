package lk.ijse.gdse.aad.extracomponent;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class MyExtraComponent implements Serializable {
    MyExtraComponent(){
        System.out.println("My Comp");
    }
}
