package BOSE_Lab9;

public class Radio {
    private Volume volume;
    private Channel channel;
    private boolean on;

    public Radio(int vol){
        on = false;
        channel = new Channel();
        volume = new Volume(vol);
    }

    public void volumeUp(){
        if(this.isOn()){
            volume.volumeUp();
        }
    }

    public void volumeDown(){
        if(this.isOn()){
            volume.volumeDown();
        }
    }

    public void channelUp(){
        if(this.isOn()){
            channel.channelUp();
        }
    }

    public void channelDown(){
        if(this.isOn()){
            channel.channelDown();
        }
    }

    public boolean isOn(){
        return on;
    }

    public void switchOnOff(){
        on = !on;
    }

    public String play(){
        if(isOn()) {
            return "Radio is playing on channel " + channel.getChannel() + " with volume " + volume.getVolume();
        }
        else return "radio is off";
    }

    public int getVolume() {
        return volume.getVolume();
    }

    public int getChannel() {
        return channel.getChannel();
    }
}
