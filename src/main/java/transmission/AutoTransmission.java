package transmission;

public class AutoTransmission implements Transmission {

    private int gear = 0;
    private int maxGear = 5;
    private static final int lowGear = 0;

    public AutoTransmission(int maxGear) {
        this.maxGear = maxGear;
    }

    public AutoTransmission() {

    }

    public void toRaise() throws ChangeGearException {
        if (gear == maxGear) throw new ChangeGearException("Maximum gear reached");
        gear++;
    }

    private void downshift() throws ChangeGearException {
        if (gear == lowGear) throw new ChangeGearException("Minimum gear reached");
        gear--;
    }

    @Override
    public void changeGear(int gear) throws ChangeGearException {
        throw new ChangeGearException("Switching gears in an automatic box is not possible");
    }

    @Override
    public int getGear() {
        return gear;
    }
}
