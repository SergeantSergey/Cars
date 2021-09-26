package transmission;

public class ManualTransmission implements Transmission {

    private int gear = 0;
    private int maxGear = 5;

    public ManualTransmission(int maxGear) {
        this.maxGear = maxGear;
    }

    public ManualTransmission() {

    }

    @Override
    public void changeGear(int gear) throws ChangeGearException {
        if (gear < 0 || gear > maxGear) throw new ChangeGearException();
        this.gear = gear;
    }

    @Override
    public int getGear() {
        return this.gear;
    }
}
