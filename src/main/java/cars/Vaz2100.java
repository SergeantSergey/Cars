package cars;

import beepers.Beeper;
import engines.Engine;
import generator.Generator;
import transmission.Transmission;

public class Vaz2100 extends Car {

    public Vaz2100(Beeper beeper, Engine engine, Transmission transmission, Generator generator) {
        super(beeper, engine, transmission, generator);
    }

    public void drift() {
        System.out.println("Звуки трение резины об асфальт");
    }
}
