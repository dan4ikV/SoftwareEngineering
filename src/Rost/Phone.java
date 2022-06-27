package Rost;

public class Phone {
    private String number;
    private String manufacturer;

    public Phone(String number, String manufacturer) {
        this.number = number;
        this.manufacturer = manufacturer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
