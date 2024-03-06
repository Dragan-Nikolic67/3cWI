package at.dragan.OO.Phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall (String number){
        System.out.println("Making a Call with " + number + " Ring Ring Ring");}

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
