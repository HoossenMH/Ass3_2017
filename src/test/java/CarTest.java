import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class CarTest {

    private Car car = new Car();

    @Before
    public void beforeCarModel() throws Exception
    {
        car.setCarModel("001");
    }

    @Test
    public void testCarModel() throws Exception
    {
        Assert.assertEquals("001", car.getCarModel());
    }

    @Before
    public void beforeCarName() throws Exception {
        car.setCarName("Hasan");
    }

    @Test
    public void testCarName() throws Exception
    {
        Assert.assertEquals("Hasan",  car.getCarName());
    }

}
