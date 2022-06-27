package BOSE_Lab6;

public class Main {
    public static void main(String[] args) {
        HotelSystem system = new HotelSystem();
        for(int i = 0; i < 10; i++){
            system.addRoom(new Room(true, i + 5));
        }
        for(int i = 0; i < 10; i++){
            system.addRoom(new Room(true, i + 1));
        }
        Employee employee1 = new Employee("Dan", "Vas", system);
        Customer customer1 = new Customer("Il", "NY", 4, "323232");

        customer1.checkIn(employee1, true);
        customer1.checkOut(employee1);
        System.out.println("end");
    }
}
