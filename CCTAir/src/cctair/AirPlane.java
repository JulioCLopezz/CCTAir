/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**Class to be able of create Airplane objects that has an ID, Make, Model and
 * Capacity attributes.
 * @author Ivis Ramirez
 * @author Nancy Aguilera
 * @author Julio Cesar Lopez
 */

public class AirPlane {
    
    private int iD;
    private String make = " ...";
    private String model = " ...";
    private int capacity;
    private String pilot = " ...";

    /**Constructor for Airplane objects.
     * 
     * @param iD integer
     * @param make String
     * @param model String
     * @param capacity integer
     */
    public AirPlane(int iD, String make, String model, int capacity) {
        this.iD = iD;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    /**ID Airplane getter. To identify the Airplane in case that the user wanna 
     * use a specific airplane.
     * @return ID Airplane
     */    
    public int getiD() {
        return iD;
    }

    /**ID Airplane setter. To set an ID number on each airplane, this will help 
     * to find the airplane and assigns it.
     */       
    public void setiD(int iD) {
        this.iD = iD;
    }

    /**Airplane make getter. To get the name of the company that make the airplane 
     * @return Airplane make.
     */        
    public String getMake() {
        return make;
    }

    /**Airplane model getter. To get the model of the airplane object. 
     * @return Airplane model.
     */        
    public String getModel() {
        return model;
    }
    /**Airplane capacity getter. To know the number of seats of the airplane. 
     * @return Airplane capacity.
     */    
    public int getCapacity() {
        return capacity;
    }

    /**Airplane pilot getter. To identify the pilot in this Flight for the airplane 
     * @return Airplane pilot.
     */        
    public String getPilot() {
        return pilot;
    }

    /**Airplane make setter. To set which company made the airplane. 
     */      
    public void setMake(String make) {
        this.make = make;
    }

    /**Airplane model setter. To set model of the airplane. 
    */    
    public void setModel(String model) {
        this.model = model;
    }

    /**Airplane capacity setter. To set number of seats in the airplane. 
    */     
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**Airplane pilot setter. To set the pilot details. 
    */      
    public void setPilot(String pilot) {
        this.pilot = pilot;
    }
    
    /**Assign pilot. To assign the pilot for the airplane. 
    */    
    public void assignPilot(String pilot) {
        this.pilot = pilot;
        setPilot(pilot);
    }
    
    /**Method to collect the whole Airplane Information with the pilot name and 
     * display it when the toString method of the class AirPlane is called.
     *
     * @return Airplane information in String format.
     */
    @Override
    public String toString() {
        return "\tAirplane Information:\n\t\tAircraft:(" + iD + ") make:" + make + ", model:" + model + 
                "\n\t\tCapacity: " + capacity + " seats" +
                "\n\t\tPilot: " + pilot + "\n";
    }
    
    
}      

