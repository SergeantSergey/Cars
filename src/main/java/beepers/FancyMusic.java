package beepers;

public class FancyMusic implements Beeper {

    @Override
    public String makeSound() {
        return "What is Love?";
    }

    public String checkArtist() {
        return "Artist Variant";
    }
}
