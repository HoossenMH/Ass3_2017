/**
 * Created by student on 2016/03/13.
 * MH_Hoossen_213223538_3.A
 */
public class Car {

    private String carName;
    private String carModel;

    public Car() {

    }

    public Car(String carName,String carModel)
    {
        this.carName = carName;
        this.carModel = carModel;
    }

    public String getCarName()
    {
        return carName;
    }

    public void setCarName(String carName)
    {
        this.carName = carName;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public void setCarModel(String carModel)
    {
        this.carModel = carModel;
    }
}
