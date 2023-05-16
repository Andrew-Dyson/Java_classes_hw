import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void canRemoveWater(){
        waterbottle.drinkWater();
        assertEquals(90, waterbottle.getVolume());
    }


}
