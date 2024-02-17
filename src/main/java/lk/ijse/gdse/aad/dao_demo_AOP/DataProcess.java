package lk.ijse.gdse.aad.dao_demo_AOP;

import org.springframework.stereotype.Component;

@Component
public class DataProcess {
    public void dataProcessStarted(){
        System.out.println("Data process Started");
    }
    public void dataProcessEnd(){
        System.out.println("Data process Ended");
    }

}
