package Car;

public class Toyota implements Car {
    public void start() {
        System.out.println("---Toyota starts---");
    }

    public void stop() {
        System.out.println("---Toyota stops---");
    }

    public void turnLeft() {
        System.out.println("Toyota turns left");
    }

    public void turnRight() {
        System.out.println("Toyota turns right");
    }
}
