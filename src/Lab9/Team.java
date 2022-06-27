package Lab9;

import java.util.LinkedList;

public class Team {
    LinkedList<Employee> employees;
    LinkedList<Project> projects;

    public Team(LinkedList<Employee> employees, LinkedList<Project> projects) {
        this.employees = employees;
        this.projects = projects;
    }
}
