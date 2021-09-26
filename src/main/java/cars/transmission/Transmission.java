package cars.transmission;

public interface Transmission {

    void changeGear(int gear) throws ChangeGearException;

    int getGear();
}
