package at.dragan.OO.Car;

public class RearMirror {
    private int size;
    private int position;


    public RearMirror(int size, int position){
        this.size = size;
        this.position = position;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }
}
