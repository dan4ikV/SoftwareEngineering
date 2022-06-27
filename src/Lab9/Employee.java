package Lab9;


import java.util.LinkedList;

public class Employee {
    int uniqueId;
    String name;
    String surname;
    LinkedList<Task> tasks;
    LinkedList<Team> teams;

    public Employee(int uniqueId, String name, String surname) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.surname = surname;
        tasks = new LinkedList<Task>();
        teams = new LinkedList<Team>();
    }
}
