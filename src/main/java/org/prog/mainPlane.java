package org.prog;

public class mainPlane {
    public static void main(String[] args) {
        System.out.println("I will buy  " + Plane.modelName );
        Plane myPlane = new Plane("magenta");
        System.out.println("Plane before paint are: " );
        System.out.println("Me plane color " + myPlane.getPlaneColor());
        System.out.println("------------------------------------");
        myPlane.paintPlane("yellow");
        System.out.println("Plane after paint are: " );
        System.out.println("Current my plane " + myPlane.getPlaneColor() + " " + myPlane.modelName);}
}

