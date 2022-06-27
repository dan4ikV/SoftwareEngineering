package Rost;

public class StationaryPhone extends Phone {
    private String belongsTo;

    public StationaryPhone(String number, String manufacturer, String belongsTo) {
        super(number, manufacturer);
        this.belongsTo = belongsTo;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    @Override
    public String toString() {
        return "StationaryPhone{" +
                "Manufacturer=" + this.getManufacturer() + "\n" +
                "number=" + this.getNumber() + "\n" +
                "belongsTo='" + belongsTo + "\n" +
                '}';
    }
}
