package com.design.builder;


import com.design.builder.cars.Type;
import com.design.builder.components.Engine;
import com.design.builder.components.GPSNavigator;
import com.design.builder.components.Transmission;
import com.design.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}

