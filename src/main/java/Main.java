import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import cars.*;
import engines.Engine;
import engines.Engine12V;
import engines.FSDEngine;
import generator.AtomicGenerator;
import generator.BoshGenerator;
import transmission.AutoTransmission;
import transmission.ChangeGearException;
import transmission.ManualTransmission;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Lambo lambo = createLambo();

        Viper viper = createViper();
        viper.scopeFuel();
        viper.landToPlanet();

        Vaz2100 vaz2100 = createVaz2100();
        vaz2100.drift();

        BMW bmw = createBMW();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(lambo);
        cars.add(viper);
        cars.add(vaz2100);
        cars.add(bmw);

        for (Car car : cars) {
            checkCar(car);
        }
    }

    private static void checkCar(Car car) {
        System.out.println("—————");
        System.out.println(car.checkBeeper());
        System.out.println(car.checkEngine());
        System.out.println(car.checkTransmission());
        System.out.println(car.checkGenerator());
        System.out.println(car.getGear());

        try {
            car.changeGear(3);
        } catch (ChangeGearException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Lambo createLambo() {
        Beeper magicSparks = new MagicSparks();
        AutoTransmission autoTransmission = new AutoTransmission(4);
        Engine engine12V = new Engine12V();
        BoshGenerator generator = new BoshGenerator();
        return new Lambo(magicSparks, engine12V, autoTransmission, generator);
    }

    private static Viper createViper() {
        return new Viper(
                new FancyMusic(),
                new FSDEngine(),
                new AutoTransmission(12),
                new AtomicGenerator()
        );
    }

    private static Vaz2100 createVaz2100() {
        return new Vaz2100(
                new Horn(),
                new Engine12V(),
                new ManualTransmission(2),
                new BoshGenerator()
        );
    }

    private static BMW createBMW() {
        return new BMW(
                new FancyMusic(),
                new Engine12V(),
                new AutoTransmission(2),
                new BoshGenerator()
        );
    }
}
