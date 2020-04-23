package AbstractFactory;

import AbstractFactory.car.Car;

public abstract class CarFactory {
    public abstract Car createCar(Integer engineSize);


}
