package at.dragan.OO.Car;

public class Tire {
    private int Tsize;
    private int Tposition; // 1 2 3 4


    public Tire(int size, int position) {
        this.Tsize = size;
        if (position > 4) {
            System.out.println("Invalid Tire position");
        } else {
            this.Tposition = position;
        }
    }

    public void setTposition(int tposition) {
        Tposition = tposition;
    }

    public void setTsize(int tsize) {
        Tsize = tsize;
    }

    public int getTposition() {
        return Tposition;
    }

    public int getTsize() {
        return Tsize;
    }
}