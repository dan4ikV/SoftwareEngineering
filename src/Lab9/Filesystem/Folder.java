package Lab9.Filesystem;
import javax.management.InstanceNotFoundException;
import java.util.LinkedList;

public class Folder {
    private String name;
    private LinkedList<File> files;
    private LinkedList<Folder> subfolders;
    private Folder parent;

    public Folder(String name) {
        this.name = name;
        this.parent = null;
    }

    private Folder(String name, Folder parent) throws InstanceNotFoundException{
        //precondition
        //Folder name should not be empty
        if (name.isBlank()){
            throw new InstanceNotFoundException();
        }
        this.name = name;
        this.parent = parent;
    }

    public boolean createSubfolder(String name) throws InstanceNotFoundException{
        for (Folder subfolder : subfolders) {
            if(subfolder.getName() == name){
                return false;
            }
        }
        subfolders.add(new Folder(name, this));
        return true;
    }

    public String getName() {
        return name;
    }

    public void dir(){
        for (File file : files){
            System.out.println("File: " + file.getName() + file.getSize());
        }
        for (Folder folder : subfolders){
            System.out.println("Folder: " + folder.getName());
        }
    }

    public Folder cd() throws InstanceNotFoundException{
        if (parent != null){
            return parent;
        }
        else {
            //precondition
            //A folder should return a parent folder, if not (if is a root folder) throw an exception
            throw new InstanceNotFoundException();
        }
    }

    public Folder cd(String folderName) throws InstanceNotFoundException{
        for (Folder folder : subfolders){
            if (folder.getName() == folderName){
                return folder;
            }
        }
        //precondition
        //A folder user wants to navigate to should exist, otherwise throw an exception
        throw new InstanceNotFoundException();
    }

    public boolean newFile(File createdFile){
        for (File file : files){
            if (file.getName() == createdFile.getName()){
                //precondition:
                //A file with the existing name can not be added
                return false;
            }
        }
        return true;
    }
}
