package engines;

import engines.Engine;

public class FSDEngine implements Engine {

    public String prepareFSD() {
        return "prepared";
    }

    @Override
    public String makeRotation() {
        return "60ly/s";
    }
}
