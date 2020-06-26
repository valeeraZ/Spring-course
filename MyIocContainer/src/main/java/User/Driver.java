package User;

import Car.Car;

public abstract class Driver implements User {
    protected Car car;

    //所有被依赖的Bean通过构造方法注入
    public Driver(Car car){
        this.car = car;
    }

    public abstract void goHome();
}
