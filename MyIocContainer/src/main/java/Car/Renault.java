package Car;

public class Renault implements Car {
    public void start() {
        System.out.println("---Renault starts---");
    }

    public void stop() {
        System.out.println("---Renault stops---");
    }

    public void turnLeft() {
        System.out.println("Renault turns left");
    }

    public void turnRight() {
        System.out.println("Renault turns right");
    }
}
