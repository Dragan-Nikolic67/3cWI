package at.dragan.OO.Phone;

public class PhoneFile {
    private String extension;
    private int sizeInMB;
    private String name;

    public PhoneFile(String extension, int sizeInMB, String name) {
        this.extension = extension;
        this.sizeInMB = sizeInMB;
        this.name = name;
    }

    public String getInfo (PhoneFile file) {
       return name + "." + extension + " This files size is " + sizeInMB;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public String getName() {
        return name;
    }
}
