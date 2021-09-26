package bus;

import bus.people.People;

import java.util.ArrayList;

abstract public class Bus {

    protected int countPlaces;
    private ArrayList<People> peoples = new ArrayList<>();

    public Bus(int countPlaces) {
        this.countPlaces = countPlaces;
    }

    public void loadPassengers(ArrayList<People> peoplesToLoad) {
        for (People people : peoplesToLoad) {
            if (peoples.size() <= countPlaces) {
                peoples.add(people);
            }
        }
    }

    public void unloadPassenger(People people) {
        peoples.remove(people);
    }

    public void unloadPassenger(ArrayList<People> peoplesToRemove) {
        for (People people : peoplesToRemove) {
            peoples.remove(people);
        }
    }

    public int getCountPassenger() {
        return peoples.size();
    }
}
