import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Hasan on 3/26/2017.
 */
public class AppConfigTest {
    private CarInterface car;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        car = (CarInterface)ctx.getBean("car");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCarName() throws Exception {
        String name = car.carName("BMW");
        Assert.assertEquals(name, "BMW");
    }

}