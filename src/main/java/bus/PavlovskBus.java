package bus;

public class PavlovskBus extends Bus {

    private Boolean isOpened = true;

    public PavlovskBus(int countPlaces) {
        super(countPlaces);
    }

    public String openDoor() {
        if (isOpened) {
            return "The doors are already open";
        } else {
            isOpened = true;
            return "The doors are open";
        }
    }

    public String closeDoor() {
        if (!isOpened) {
            return "The doors are already close";
        } else {
            isOpened = false;
            return "The doors are close";
        }
    }
}
