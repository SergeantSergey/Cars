package cars;

import beepers.Beeper;
import cars.engines.Engine;
import cars.generator.Generator;
import cars.transmission.Transmission;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, Transmission transmission, Generator generator) {
        super(beeper, engine, transmission, generator);
    }
}
