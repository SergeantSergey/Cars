package beepers;

import beepers.Beeper;

public class MagicSparks implements Beeper {

    @Override
    public String makeSound() {
        return "010101010010101010010101";
    }
}
