package Lab9.Filesystem;

import javax.management.InstanceNotFoundException;

public class File {
    private String name;
    private int size;

    public File(String name, int size) throws InstanceNotFoundException{
        //precondition
        //filename should not be blank
        if (name.isBlank()){
            throw new InstanceNotFoundException();
        }
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
