package interfaces;

public class Car implements engine,Brake,media {

    public void brake() {
        System.out.println("Brake");
    }
    @Override
    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void acc() {
        System.out.println("accelerate");
    }
}
