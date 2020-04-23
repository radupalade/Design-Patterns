package AbstractFactory;

import AbstractFactory.car.Car;
import AbstractFactory.car.Duster;
import AbstractFactory.car.Logan;
import AbstractFactory.car.Sandero;

public class DaciaFactory extends CarFactory {


    public Car createCar(Integer engineSize) {
        switch (engineSize) {
            case 1200:
                return new Sandero(engineSize);
            case 1600:
                return new Logan(engineSize);
            case 2000:
                return new Duster(engineSize);
            default:
                return null;
        }
    }
}
