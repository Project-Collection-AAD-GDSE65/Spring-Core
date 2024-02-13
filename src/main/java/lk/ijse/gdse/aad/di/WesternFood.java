package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Delicious
@Qualifier("Milk")
public class WesternFood implements FavFood {
    @Override
    public void balance() {
        System.out.println("Ham");
        System.out.println("Beken");

    }
}
