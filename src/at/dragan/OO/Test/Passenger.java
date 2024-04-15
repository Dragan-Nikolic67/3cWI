package at.dragan.OO.Test;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void inform(String message){
        System.out.println(("Ich bin " + this.firstName + " " + this.lastName + " und ich bin informiert, die Nachricht ist " + message));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
