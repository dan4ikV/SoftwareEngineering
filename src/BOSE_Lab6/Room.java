package BOSE_Lab6;

import java.util.LinkedList;

public class Room {
    private boolean type;
    private double price;
    private LinkedList<Customer> customers;

    public Room(boolean type, double price) {
        this.type = type;
        this.price = price;
        customers = new LinkedList<Customer>();
    }

    public boolean getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(Customer customer){
        if(isFree()){
            customers.add(customer);
            return true;
        }
        return false;
    }

    public void removeCustomer(Customer customer){
        for(int i = 0; i < customers.size(); i++){
            if (customers.get(i).getDocumentNumber() == customer.getDocumentNumber()){
                customers.remove(i);
            }
        }
    }

    public boolean isFree(){
        if(type){
            if(customers.isEmpty()){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(customers.size() < 2 ){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
