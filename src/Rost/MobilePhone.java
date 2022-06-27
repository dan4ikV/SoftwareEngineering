package Rost;
import java.util.Arrays;
import java.util.LinkedList;

public class MobilePhone extends Phone{
    private int batteryCapacity;
    private int[] screenResolution;
    private LinkedList<MobilePhone> callHistory;

    public MobilePhone(String number, String manufacturer, int batteryCapacity, int[] screenResolution) {
        super(number, manufacturer);
        this.batteryCapacity = batteryCapacity;
        this.screenResolution = screenResolution;
        this.callHistory = new LinkedList<MobilePhone>();
    }

    @Override
    public String toString() {
        return "MobilePhone{\n" +
                "Manufacturer=" + this.getManufacturer() + "\n" +
                "number=" + this.getNumber() + "\n" +
                "batteryCapacity=" + batteryCapacity + "\n" +
                "screenResolution=" + screenResolution[0] + "x" + screenResolution[1] + "\n" +
                "}";
    }

    public void addToCallHistory(MobilePhone call) {
        this.callHistory.add(call);
    }

    public void call(MobilePhone otherPhone){
        this.callHistory.add(otherPhone);
        otherPhone.addToCallHistory(this);
    }

    public void showCallHistory(){
        for (MobilePhone call: callHistory) {
            System.out.println(this.getNumber() + " розмовляв з " + call.getNumber());
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int[] getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int[] screenResolution) {
        this.screenResolution = screenResolution;
    }
}
