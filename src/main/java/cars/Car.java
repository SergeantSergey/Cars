package cars;

import beepers.Beeper;
import cars.engines.Engine;
import cars.generator.Generator;
import cars.transmission.ChangeGearException;
import cars.transmission.Transmission;

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
