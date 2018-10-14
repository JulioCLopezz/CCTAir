/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Scanner;

/**SetUp class to define and create airplanes, create and modify the flights, and 
 * display the menu for this program. Declare and initialize Airplanes and Flights.
 *
 * @author Ivis Ramirez
 * @author Nancy Aguilera
 * @author Julio Cesar Lopez
 */
public class SetUp {
    
    Scanner kB = new Scanner(System.in); // Scanner
    Scanner kB2 = new Scanner(System.in); // Scanner 2
    
    ArrayList<AirPlane> airplane = new ArrayList<>(); //ArrayList of Aircrafts
    AddAirPlane aP = new AddAirPlane(); // AddAirPlane
    
    ArrayList<Flight> flights = new ArrayList<>(); //ArrayList of Flights
    AddFlight aF = new AddFlight(); // Add Flight
    
    /**Method that allow add Airplanes to the Airplane list of the Airline.
     * 
     */
    public void addAirPlane()
    {
        aP.addAirPlane(airplane);
        showAirPlane(); // Display AirPlane List
    } 
 
    /**Method that allow display the Airline Airplanes.
     * 
     */
    public void showAirPlane(){
        airplane.forEach((plane) -> {
            System.out.println(plane);
        });
    }

    /**Method that allow create pilot object with rating and name.
     * 
     */
    public void addPilot() {
        System.out.println("Select the AirPlane number:");
        int pNumber = kB.nextInt();
        System.out.println("Select the Pilots Name:");
        String pName = kB2.nextLine();
        airplane.get(pNumber-1).assignPilot(pName);        
    }


    /**Method that allow create Flight object and display Flights available.
     * 
     */    
    public void addFlight() {
        aF.addFlight(flights);
        showFlight(); // Display Flight List
    }

     /**Method that show all the Flights created.
     * 
     */   
    public void showFlight(){
        flights.forEach((flight) -> {
            System.out.println(flight);
        });
    }

    /**Method that allow set the Airplane to a Flight using the Scanner and 
     * Flight number.
     * 
     */     
    public void addPlane() {
        System.out.println("Select the Flight number:");
        int fNumber = kB.nextInt();
        System.out.println("Select the AirPlane number:");
        int aNumber = kB.nextInt();
        flights.get(fNumber-1).setPlane(airplane.get(aNumber-1));        
    }

    /**Method to set FLight's departure and arrival Time. You need Flight number.
     * 
     */      
    public void scheduleTime() {
        System.out.println("Enter Flight number:");
        int fNumber = kB.nextInt();
        System.out.println("Enter Departure Time:");
        String dTime = kB2.nextLine();
        System.out.println("Enter Arrival Time:");
        String aTime = kB2.nextLine();
        flights.get(fNumber-1).schedule(aTime, dTime);        
    }

    /**Method to update arrival Time in case of a delay.It is necessary Flight number.
     * 
     */      
    public void updateTime() {
        System.out.println("Enter Flight number:");
        int fNumber = kB.nextInt();
        System.out.println("Enter Arrival Time:");
        String aTime = kB2.nextLine();
        flights.get(fNumber-1).schedule(aTime);        
    }

    /**Method where is created the menu of options that are available on this program.
     * 
     */      
    public void menu(){
          
        System.out.println("\nMenu");
        System.out.println("1. Select 1 to add AirPlane to the System");       
        System.out.println("2. Select 2 to show the list of AirPlanes");             
        System.out.println("3. Select 3 to assign a Pilot to an AirPlane"); 
        System.out.println("4. Select 4 to add a Flight to the System");
        System.out.println("5. Select 5 to show the list of Flights");
        System.out.println("6. Select 6 to assign an AirPlane to a Flight");
        System.out.println("7. Select 7 to Set the arrival time to a Flight");
        System.out.println("8. Select 8 to Set departure and arrival time to a flight");
        System.out.println("0. Select 0 to EXIT");  
        
        /**Switch to works with the menu options.
         * 
         */
        switch (kB.nextInt()){
            case 1: {addAirPlane();
            menu();}
                break;
            case 2: {showAirPlane();
            menu();}
                break;
                case 3: {addPilot();
            menu();}
                break;
                case 4: {addFlight();
            menu();}
                break;
                case 5: {showFlight();
            menu();}
                break;
                case 6: {addPlane();
            menu();}
                break;
                case 7: {scheduleTime();
            menu();}
                break;
                case 8: {updateTime();
            menu();}
                break;
                case 0: {System.out.println("Have a nice Day, See you!!");
            }
                break;                
            default: {System.out.println("Wrong option. Please try again");
                menu();}                
        }
    }
    
}
