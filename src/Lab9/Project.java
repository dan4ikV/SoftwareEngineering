package Lab9;

import java.util.Date;
import java.util.LinkedList;

public class Project {
    String name;
    Date startDate;
    Date endDate;
    LinkedList<Task> tasks;

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
