package at.dragan.OO.Test;

public class Position {
    private int langtitude;
    private int latitude;

    public Position (int langtitude, int latitude){
        this.langtitude = langtitude;
        this.latitude = latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(int longtitude) {
        this.langtitude = longtitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongtitude() {
        return langtitude;
    }
}
