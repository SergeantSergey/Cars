package cars;

import beepers.Beeper;
import cars.engines.Engine;
import cars.generator.Generator;
import cars.transmission.Transmission;

public class BMW extends Car {

    public BMW(Beeper beeper, Engine engine, Transmission transmission, Generator generator) {
        super(beeper, engine, transmission, generator);
    }

    @Override
    public String checkEngine() {
        return "Engine is wrong";
    }
}
