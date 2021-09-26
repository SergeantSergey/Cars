package cars;

import beepers.Beeper;
import cars.engines.Engine;
import cars.generator.Generator;
import cars.transmission.Transmission;

public class Viper extends Car {

    public Viper(Beeper beeper, Engine engine, Transmission transmission, Generator generator) {
        super(beeper, engine, transmission, generator);
    }

    public void scopeFuel() {
        System.out.println("Fuel scooped");
    }

    public void landToPlanet() {
        System.out.println("Landing to Earth");
    }
}
