package cars;

import beepers.Beeper;
import cars.Car;
import engines.Engine;

public class Viper extends Car {

    public Viper(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    public void scopeFuel() {
        System.out.println("Fuel scooped");
    }

    public void landToPlanet() {
        System.out.println("Landing to Earth");
    }
}
