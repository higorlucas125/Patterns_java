package PatternsCreational.LearningBuilder.builders;

import PatternsCreational.LearningBuilder.cars.CarType;
import PatternsCreational.LearningBuilder.components.Engine;
import PatternsCreational.LearningBuilder.components.GPSNavigator;
import PatternsCreational.LearningBuilder.components.Transmission;
import PatternsCreational.LearningBuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
