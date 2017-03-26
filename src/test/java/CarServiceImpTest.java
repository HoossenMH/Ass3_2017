import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hasan on 3/26/2017.
 */
public class CarServiceImpTest {

    @Test
    public void carName() throws Exception {
       CarInterface carI = new CarServiceImp();

       String name = carI.carName("Toyota");

        Assert.assertEquals(name, "Toyota");
    }

}