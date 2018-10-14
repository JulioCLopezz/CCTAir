/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**CCTAir program has the features of create and modify flights, holding data as 
 * Airplane (mark, model and capacity), Pilot (name) and Flight (Origin, Destination,
 * times and other details related to it).
 * 
 * @author Julio Cesar Lopez
 * @author Nancy Aguilera
 * @author Ivis Ramirez
 */
public class CCTAir {

    public static SetUp sp = new SetUp();
    
    /**Main mehtod of the program which will connect with the rest of classes and
     * methods as it is required. There we are declaring and initializing the
     * airplanes and FLights.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        sp.airplane.add(new AirPlane(1, "Pilatus", "676", 500));
        sp.airplane.add(new AirPlane(2, "Cessna", "747", 500));
        sp.airplane.add(new AirPlane(3, "Embraer", "956", 500));
        sp.airplane.add(new AirPlane(4, "Pilatus", "501", 500));
        sp.airplane.add(new AirPlane(5, "Cessna", "203", 500));
        
        sp.flights.add(new Flight(1, "Dublin", "Fort Laudedale", "17-8-2018"));
        sp.flights.add(new Flight(2, "Dublin", "Bali", "3-8-2018"));
        sp.flights.add(new Flight(3, "Dublin", "Sydney", "12-12-2018"));
        sp.flights.add(new Flight(4, "Dublin", "Tokyo", "20-7-2018"));
        sp.flights.add(new Flight(5, "Dublin", "Malaga", "15-6-2018"));
        
        /*
        Pilot p1 = new Pilot("Alan Faye", 01, 3);
        Pilot p2 = new Pilot ("Patrick Waldron", 02, 5);
        Pilot p3 = new Pilot ("Bernard Walsh", 03, 2);
        Pilot p4 = new Pilot ("Niall Potter", 04, 4);
        Pilot p5 = new Pilot("Sean Connolly", 05, 5);
        */
        sp.menu();
    } 
}
