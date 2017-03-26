import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class CarListTest {

    private CarList carL;
    private Car c;

    @Before
    public void initialize() throws Exception
    {
        carL = new CarList();
        c = new Car("Hasan", "001");
    }

    @Test
    public void addCarTest() throws Exception
    {
        carL.addCar(c);
        //Assert.assertEquals(c, carL.addCar(c));
    }

    @Test
    public void removeCarTest() throws Exception
    {
        carL.removeCar(c);
        Assert.assertEquals(true, carL.removeCar(c));
    }
}
