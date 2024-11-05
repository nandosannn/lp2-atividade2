package model;

public class Car {
    private Motor motor;

    public Car() {
        motor = new Motor(); // Car cria e contém um Motor
    }

    public void startCar() {
        motor.start();
        System.out.println("Car is moving");
    }
}
