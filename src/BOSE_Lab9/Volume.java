package BOSE_Lab9;

public class Volume {
    private int volume;

    public Volume(int volume) {
        this.volume = volume;
    }

    public void volumeUp(){
        if(volume < 100){
            volume += 1;
        }
    }

    public void volumeDown(){
        if(volume > 0){
            volume -= 1;
        }
    }

    public int getVolume() {
        return volume;
    }
}
