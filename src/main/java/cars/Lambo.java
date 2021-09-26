package cars;

import beepers.Beeper;
import cars.Car;
import engines.Engine;
import generator.Generator;
import transmission.Transmission;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, Transmission transmission, Generator generator) {
        super(beeper, engine, transmission, generator);
    }
}
