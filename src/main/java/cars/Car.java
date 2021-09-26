package cars;

import beepers.Beeper;
import engines.Engine;
import generator.Generator;
import transmission.ChangeGearException;
import transmission.Transmission;

import java.io.IOException;

public abstract class Car {

    private Beeper beeper;
    private Engine engine;
    private Transmission transmission;
    private Generator generator;

    public Car(Beeper beeper, Engine engine, Transmission transmission, Generator generator) {
        this.beeper = beeper;
        this.engine = engine;
        this.transmission = transmission;
        this.generator = generator;
    }

    public String checkBeeper() {
        return beeper.makeSound();
    }

    public String checkEngine() {
        return engine.makeRotation();
    }

    public String checkTransmission() {
        return "current gear " + this.transmission.getGear();
    }

    public String checkGenerator() {
        return generator.generateEnergy();
    }

    public int getGear() {
        return this.transmission.getGear();
    }

    public void changeGear(int gear) throws ChangeGearException {
        this.transmission.changeGear(gear);
    }
}
