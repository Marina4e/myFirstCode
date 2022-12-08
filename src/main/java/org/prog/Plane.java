package org.prog;
public class Plane {
    public static String modelName = "vipPlane";
    private String color;
    public int passengers;
    private String[] passengerNames = new String[6];
    public Plane(String c) {
        color = c;}
    public void paintPlane(String c) {
        color = c;
    }
    public String getPlaneColor() {
        return color;
    }
    public void  setPassenger(int passengers) {
        this.passengers = passengers;
    }
    public int getPassenger() {
        return passengers;
    }
    public String[] getPassengerNames() {
        return passengerNames;
    }
    public String getPassenger (int index) {
        return passengerNames[index];
    }
    public void setPassengerNames(String[] passengerNames) {
        this.passengerNames = passengerNames;
    }
}


