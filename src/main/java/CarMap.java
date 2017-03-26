import java.util.HashMap;

/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class CarMap {

    private static HashMap<Integer, Car> car = new HashMap<Integer, Car>();

    public void addCar(String name, String model)
    {

        Car c = new Car(name, model);
        car.put(Integer.parseInt(model), c);
    }

    public void removeCar(String model)
    {
        Car c = car.get(Integer.parseInt(model));

        if(c != null) {

            car.remove(Integer.parseInt(model));
        }
    }
}
