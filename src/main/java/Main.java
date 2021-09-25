import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import cars.Car;
import cars.Lambo;
import cars.Viper;
import engines.Engine;
import engines.Engine12V;
import engines.FSDEngine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Beeper horn = new Horn();
        Beeper fancyMusic = new FancyMusic();
        Beeper magicSparks = new MagicSparks();

        ((FancyMusic) fancyMusic).checkArtist();

        Engine engine12V = new Engine12V();

        Lambo lambo = new Lambo(magicSparks, engine12V);

        System.out.println(lambo.checkBeeper());
        System.out.println(lambo.checkEngine());

        Viper viper = new Viper(magicSparks,new FSDEngine());

        viper.scopeFuel();
        viper.landToPlanet();

        System.out.println(viper.checkBeeper());
        System.out.println(viper.checkEngine());

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(lambo);
        cars.add(viper);

        System.out.println("____");

        for (Car car : cars) {
            System.out.println(car.checkBeeper());
            System.out.println(car.checkEngine());
        }
    }
}
