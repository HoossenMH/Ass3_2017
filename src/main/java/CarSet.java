import java.util.HashSet;

/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class CarSet {

    private HashSet<Car> car = new HashSet<Car>();

    public void addCar(String name, String model)
    {
        Car c = new Car(name, model);
        car.add(c);
    }

    public boolean removeCar(Car c)
    {

        boolean found = false;

        for(int i = 0; i < car.size() && found == false; i++)
        {

            car.remove(c);
            return true;
        }

        return false;
    }
}
