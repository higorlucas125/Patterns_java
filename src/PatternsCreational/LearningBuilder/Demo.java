package PatternsCreational.LearningBuilder;

import PatternsCreational.LearningBuilder.builders.CarBuilder;
import PatternsCreational.LearningBuilder.builders.CarManualBuilder;
import PatternsCreational.LearningBuilder.cars.Car;
import PatternsCreational.LearningBuilder.cars.Manual;
import PatternsCreational.LearningBuilder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car build: " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();


        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
