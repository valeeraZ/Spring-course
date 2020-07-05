package User;

import Car.Car;

public class UserA extends Driver{
    public UserA(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.turnLeft();
        car.stop();
    }
}
