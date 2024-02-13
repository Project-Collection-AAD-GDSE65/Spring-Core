package lk.ijse.gdse.aad.di_intro;

import org.springframework.stereotype.Component;

@Component
public class HealthyPerson implements Fitness{
    @Override
    public String walk() {
        return "2km per day";
    }
}
