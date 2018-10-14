/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Scanner;

/**Class that will create the flight objects and contain it in an array. On this
 * case an array list due to it has flexible size.
 *
 * @author Ivis Ramirez
 * @author Nancy Aguilera
 * @author Julio Cesar Lopez
 */
public class AddAirPlane {
    
    /**
     * Declaring an array list
    */
    ArrayList<AirPlane> airplane;
    
    public static SetUp sp = new SetUp();
    /** Method of type ArrayList to contain all the airplane objects created.
     * @param airplane ArrayList Airplane
     * @return airplane object
    */
    public ArrayList<AirPlane> addAirPlane(ArrayList<AirPlane> airplane) { // add an airplane
        
        Scanner kB = new Scanner(System.in); // Scanner
            int iDCount = airplane.size() + 1;
            
            AirPlane plane = new AirPlane(iDCount, "", "", 0); // new instance of AirPlane class
            
            System.out.println("Enter Airplane's Make:");
            plane.setMake(kB.nextLine()); // Set Make
            
            System.out.println("Enter Airplane's Model:");
            plane.setModel(kB.nextLine()); // Set Model
            
            System.out.println("Enter Airplane's Capacity:");
            plane.setCapacity(kB.nextInt()); // Set Capacity
            
            airplane.add(plane);
        
        return airplane; // Returns to AirPlane
        
    }
    
}
