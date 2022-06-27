package BOSE_Lab9;

public class Channel {
    private int channel;

    public Channel() {
        this.channel = 1;
    }

    public void channelUp(){
        channel = channel % 5 + 1;
    }

    public void channelDown(){
        channel = channel == 1 ? 5 : channel - 1;
    }

    public int getChannel() {
        return channel;
    }
}
