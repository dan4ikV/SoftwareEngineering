import BOSE_Lab9.Radio;
import org.junit.Assert;
import org.junit.Test;

public class UnitTests {
    @Test
    public void testVolume() {
        Radio radio = new Radio(30);
        for(int i = 0; i < 200; i++){
            radio.volumeDown();
        }
        Assert.assertEquals(radio.getVolume(), 30);//because default is 30 and the radio is off
        for(int i = 0; i < 200; i++){
            radio.volumeUp();
        }
        Assert.assertEquals(radio.getVolume(), 30);//because default is 30 and the radio is off
        radio.switchOnOff();
        for(int i = 0; i < 200; i++){
            radio.volumeDown();
        }
        Assert.assertEquals(radio.getVolume(), 0);
        for(int i = 0; i < 200; i++){
            radio.volumeUp();
        }
        Assert.assertEquals(radio.getVolume(), 100);
    }

    @Test
    public void testChannel() {
        Radio radio = new Radio(10);
        //test when off
        radio.channelDown();
        Assert.assertEquals(radio.getChannel(), 1);
        radio.channelUp();
        Assert.assertEquals(radio.getChannel(), 1);

        radio.switchOnOff();
        //test while on
        radio.channelDown();
        Assert.assertEquals(radio.getChannel(), 5);
        radio.channelUp();
        Assert.assertEquals(radio.getChannel(), 1);
    }

    @Test
    public void testPlay() {
        Radio radio = new Radio(10);
        //test when off
        Assert.assertEquals(radio.play(), "radio is off");

        radio.switchOnOff();

        //test while on
        Assert.assertEquals(radio.play(), "Radio is playing on channel 1 with volume 10");
        radio.channelDown();
        for (int i = 0; i < 100; i ++){
            radio.volumeDown();
        }
        Assert.assertEquals(radio.play(), "Radio is playing on channel 5 with volume 0");

        radio.channelUp();
        for (int i = 0; i < 200; i++){
            radio.volumeDown();
        }
    }
}