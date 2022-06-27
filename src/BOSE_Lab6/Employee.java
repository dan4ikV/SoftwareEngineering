package BOSE_Lab6;

import java.util.LinkedList;

public class Employee extends Person{
    private HotelSystem system;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String name, String surname, HotelSystem system) {
        super(name, surname);
        this.system = system;
    }

    public Room checkCustomerIn(boolean roomType, Customer customer){
        LinkedList<Room> freeRooms = roomType ? system.freeSingleRooms() : system.freeDoubleRooms();
        if(freeRooms.isEmpty()){
            System.out.println("All rooms taken");
            return null;
        }
        customer.setRoom(freeRooms.get(0));
        freeRooms.get(0).addCustomer(customer);
        return freeRooms.get(0);
    }

    public void checkCustomerOut(Customer customer){
        if(customer.getRoom() != null){
            customer.getRoom().removeCustomer(customer);
            customer.setRoom(null);
        }
    }
}
