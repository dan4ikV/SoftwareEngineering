package BOSE_Lab6;

public class Customer extends Person {
    private Room room;
    private int periodOfStay;
    private String documentNumber;

    public Customer(String name, String surname, int periodOfStay, String documentNumber) {
        super(name, surname);
        this.periodOfStay = periodOfStay;
        this.documentNumber = documentNumber;
    }

    public void checkIn(Employee employee, boolean roomType){
        employee.checkCustomerIn(roomType, this);
    }

    public void checkOut(Employee employee){
        employee.checkCustomerOut(this);
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
}
