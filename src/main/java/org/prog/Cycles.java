package org.prog;

public class Cycles {
    public static void main(String[] args) {
        Plane somePlane = new Plane("yellow");
        String[] passengers = new String[6];
        passengers[0] = "Tesla";
        passengers[1] = "Nik";
        passengers[2] = "Alice";
        passengers[3] = "Me";
        passengers[4] = "Tom";
        passengers[5] = "Jerry";
        somePlane.setPassengerNames(passengers);
        for (int i = 0; i < somePlane.getPassengerNames().length; i++) {
            System.out.println( somePlane.getPassenger(i));
            switch ( somePlane.getPassenger(i)){
                case "Nik":
                    System.out.println("this is NiK!");
                    break;
                default:
                    System.out.println("this is not Nik");}
        }}}
