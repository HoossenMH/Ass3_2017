import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class CarSetTest {

    private HashSet<Car> car = new HashSet<Car>();
    private Car c;

    @Before
    public void initialize() throws Exception
    {

        car = new HashSet<Car>();
        c = new Car("Hasan", "001");
    }

    @Test
    public void add() throws Exception
    {

        car.add(c);
        Assert.assertEquals(true, car.contains(c));
    }

    @Test
    public void remove() throws Exception
    {

        boolean found = false;

        for(int i = 0; i < car.size() && found == false; i++) {

            car.remove(c);
        }

        Assert.assertEquals(false, car.contains(c));
    }
}
