package cars;

import beepers.Beeper;
import engines.Engine;

public abstract class Car {

    private Beeper beeper;
    private Engine engine;

    public Car(Beeper beeper, Engine engine) {
        this.beeper = beeper;
        this.engine = engine;
    }

    public String checkBeeper() {
        return beeper.makeSound();
    }

    public String checkEngine() {
        return engine.makeRotation();
    }
}