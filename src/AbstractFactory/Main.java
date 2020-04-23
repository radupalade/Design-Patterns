package AbstractFactory;

import AbstractFactory.car.Car;

public class Main {
    public static void main(String[] args) {

        /*DaciaFactory factory = new DaciaFactory();
        Car car1 = factory.createCar(1200);
        Car car2 = factory.createCar(2000);
*/
        CarDealer sandra = new CarDealer();
        Car car1 = sandra.deliverCar(20000d, 2000);
        Car car2 = sandra.deliverCar(14000d, 1200);



    }
}
