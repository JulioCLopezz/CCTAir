/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**Class to set the bases for the Flight object.
 *
 * @author Ivis Ramirez
 * @author Nancy Aguilera
 * @author Julio Cesar Lopez
 */
public class Flight {
    
    private int iD;
    private String origin; 
    private String destination; 
    private String departureTime = " ..."; 
    private String arrivalTime = " ..."; 
    private String dateOfFlight; 
    
    private AirPlane plane = new AirPlane(0, " ...", " ...", 0); // AirPlane

    /**Flight constructor to create Flight object.
     * 
     * @param iD integer
     * @param origin String
     * @param destination String
     * @param dateOfFlight String
     */
    public Flight(int iD, String origin, String destination, String dateOfFlight) {
        this.iD = iD;
        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
    }

    /**ID Flight getter. To identify the Flight in case that the user wanna update
     * a specific Flight.
     * @return ID Flight
     */
    public int getiD() {
        return iD;
    }

    /**ID Flight setter. To set an ID number on each flight, this will help to find 
     * a specific Flight and do changes on it.
     */    
    public void setiD(int iD) {
        this.iD = iD;
    }

    /**Airplane setter. To set the airplane info.
     */        
    public void setPlane(AirPlane plane) {
        this.plane = plane;
    }

    /**Add airplane to a flight. To set an Airplane on a flight. 
     */        
    void addPlane(AirPlane plane) // adds AirPlane to a Flight
    {
        this.plane = plane;
        setPlane(plane);
    }

    /**Origin Flight setter. To set city origin for this flight. 
     */        
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**Destination Flight setter. To set destination of this flight. 
     */        
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**Departure Time setter. To set the departure time of the flight.
     */        
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**Arrival Time setter. To set the arrival time of the flight.
     */          
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    /**Date of Flight setter. To set date of the flight.
     */    
    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    /**Origin getter. To get the Flight origin.
    * @return Flight origin
    */
    public String getOrigin() {
        return origin;
    }


    /**Destination getter. To get the Flight destination.
    * @return Flight Destination
    */
    public String getDestination() {
        return destination;
    }

    /**Departure Time getter. To get the Flight departure time.
     * @return Flight departure time
     */    
    public String getDepartureTime() {
        return departureTime;
    }

    /**Arrival Time getter. To get the Flight arrival time.
     * @return Flight arrival time.
     */    
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**Date of Flight getter. To get date of Flight from already created flights.
     * 
     * @return the date of flight
     */    
    public String getDateOfFlight() {
        return dateOfFlight;
    }
    
    /**Method used to update the arrival time in case of delay or changes.
     */    
    void schedule(String arrivalTime) // scheduled 2
    {
        this.arrivalTime = arrivalTime;
        setArrivalTime(arrivalTime);
    }

    /**Method used to assign the arrival and departure time.
     * This method is used when the flight information is being set.
     */     
    void schedule(String arrivalTime, String departureTime) // schedule 1
    {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        
        setArrivalTime(arrivalTime);
        setDepartureTime(departureTime);
    }
    
    /**Method to collect the whole Flight Information and display it.
     *
     * @return Flight information in String format.
     */
    @Override
    public String toString() 
    {
        return  "\nFlight Information:(" + iD
                + ")\n\tDate: " + dateOfFlight
                + "\n\tFrom: " + origin + " to " + destination 
                + "\n\tFlight Time: " + departureTime + " to " + arrivalTime 
                + "\n" + plane;
    }
    
}
