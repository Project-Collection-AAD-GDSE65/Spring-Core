package lk.ijse.gdse.aad.di;

import org.springframework.stereotype.Component;

@Component
public class RedRice implements FavFood {
    @Override
    public void balance() {
        System.out.println("Dhal");
        System.out.println("Dry Fish");
    }
}
