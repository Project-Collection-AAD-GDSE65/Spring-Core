package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Milk")
public class WhiteSteamRice implements FavFood {
    @Override
    public void balance() {
        System.out.println("Chicken");
        System.out.println("Egg");
    }
}
