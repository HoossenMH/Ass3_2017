import java.util.ArrayList;

/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class CarList {

    private ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(Car car)
    {
        carList.add(car);
    }

    public boolean removeCar(Car car)
    {

        if(!carList.isEmpty()) {

            carList.remove(car);
            return true;
        }
        return false;
    }
}
