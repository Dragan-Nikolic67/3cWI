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

    public void saveFile (PhoneFile file){
        this.file.add(file);
    }

    public void getAllFiles (){
        for (PhoneFile file: file){
            System.out.println(file.getInfo(file));
        }
    }
    public int getFreeSpace(){
        int sumMB = 0;
        for (PhoneFile file: file){
            sumMB += file.getSizeInMB();
        }
        return this.capacity - sumMB;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getFile() {
        return file;
    }
}
