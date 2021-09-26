import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import bus.Electrubus;
import bus.PavlovskBus;
import bus.people.Children;
import bus.people.People;
import bus.people.Student;
import cars.*;
import cars.engines.Engine;
import cars.engines.Engine12V;
import cars.engines.FSDEngine;
import cars.generator.AtomicGenerator;
import cars.generator.BoshGenerator;
import cars.transmission.AutoTransmission;
import cars.transmission.ChangeGearException;
import cars.transmission.ManualTransmission;

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

        System.out.println();
        System.out.println("—————");

        ArrayList<People> people = new ArrayList<>();
        People children1 = new Children();
        children1.setName("Вася");

        People children2 = new Children();
        children1.setName("Петя");

        people.add(children1);
        people.add(children2);

        People student1 = new Student();
        children1.setName("Никита");

        People student2 = new Student();
        children1.setName("Игорь");

        people.add(student1);
        people.add(student2);

        // загружаем пассажирова когда мест много и высаживаем сначала одного потом всех
        Electrubus electrubus = new Electrubus(10);
        System.out.println(electrubus.checkEnergy());
        electrubus.loadPassengers(people);
        System.out.println(electrubus.getCountPassenger());
        electrubus.unloadPassenger(children1);
        System.out.println(electrubus.getCountPassenger());
        electrubus.unloadPassenger(people);
        System.out.println(electrubus.getCountPassenger());

        System.out.println();

        // загружаем пассажирова когда мест мало
        PavlovskBus pavlovskBus = new PavlovskBus(3);
        System.out.println(pavlovskBus.openDoor());
        pavlovskBus.loadPassengers(people);
        System.out.println(pavlovskBus.getCountPassenger());
        System.out.println(pavlovskBus.closeDoor());
        System.out.println(pavlovskBus.closeDoor());
        System.out.println(pavlovskBus.openDoor());
        pavlovskBus.unloadPassenger(children1);
        System.out.println(pavlovskBus.getCountPassenger());
        pavlovskBus.unloadPassenger(people);
        System.out.println(pavlovskBus.getCountPassenger());
        System.out.println(pavlovskBus.closeDoor());
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
