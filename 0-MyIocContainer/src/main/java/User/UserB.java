package User;

import Car.Car;

public class UserB extends Driver{
    public UserB(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}
