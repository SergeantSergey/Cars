package bus;

public class Electrubus extends Bus {

    public Electrubus(int countPlaces) {
        super(countPlaces);
    }

    public String checkEnergy() {
        return "OK";
    }
}
