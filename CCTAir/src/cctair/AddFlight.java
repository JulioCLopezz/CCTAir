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
public class AddFlight {
    
    /**Method used to add all the flights created and contain them in this array
     * list due to the array list change its size in function of its necessities
     * 
     * @param flights Flight ArrayList
     * @return flights object
     */
    public ArrayList<Flight> addFlight(ArrayList<Flight> flights) { // add a flight
        
        Scanner kB = new Scanner(System.in); // Scanner
        
            int iDCount = flights.size() + 1;
            Flight flight = new Flight(iDCount, "", "", ""); // new instance Flight
            System.out.println("Enter Flight's Origin:");
            flight.setOrigin(kB.nextLine()); // Set Origin
            System.out.println("Enter Flight's Destination:");
            flight.setDestination(kB.nextLine()); // Set destination
            System.out.println("Enter Flight's Date:");
            flight.setDateOfFlight(kB.nextLine()); // Set date of flight
            flights.add(flight);
        
        return flights; // Returns flight
        
    }
}
