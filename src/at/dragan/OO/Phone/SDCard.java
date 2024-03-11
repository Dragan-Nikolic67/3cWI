package at.dragan.OO.Phone;

import at.dragan.OO.Lamp.LightElement;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;



    private List<PhoneFile> file;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.file = new ArrayList<>();
    }

    public void saveFile(PhoneFile file) {
        if (this.capacity > 0) {
            if (file.getSizeInMB() > this.capacity) {
                System.out.println("File " + file.getName() + " too big!");
            } else {
                this.file.add(file);
                this.capacity = this.capacity - file.getSizeInMB();
                System.out.println("Saved the " + file.getName() + " File");
            }
        } else {
            System.out.println("no more space! Can't save the " + file.getName() + " File!");
        }
    }

    public void getAllFiles() {
        for (PhoneFile file : file) {
            System.out.println(file.getInfo(file));
        }
    }
    public void deleteFile (PhoneFile file){
        if (this.file.contains(file)){
            this.file.remove(file);
            this.capacity = this.capacity + file.getSizeInMB();
        }
        else{
            System.out.println("file doesnt exist");
        }


    }

    public int getFreeSpace() {
        return this.capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getFile() {
        return file;
    }
}
