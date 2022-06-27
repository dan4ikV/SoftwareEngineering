package Cars.Details.Horn;

public class CustomHorn implements Horn{
    String sound;

    public CustomHorn(String sound) {
        this.sound = sound;
    }


    @Override
    public String sound() {
        return sound;
    }
}
