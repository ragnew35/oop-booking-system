/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ragne
 */
public class labRoom extends roomClass {
     private int numberPCs;
    private String operatingSystem;
    
    public labRoom(String RoomID, int roomNumber, int floor, int capacity, int numberPCs, String operatingSystem){
        super(RoomID, roomNumber, floor, capacity);
        this.numberPCs = numberPCs;
        this.operatingSystem = operatingSystem;
    }
    
    public void setNumberPCs(int numberPCs){
        this.numberPCs = numberPCs;
    }
    
    public int getNumberPCs(){
        return this.numberPCs;
    }
    
    public void setoperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }
    
    public String getoperatingSystem(){
        return this.operatingSystem;
    }
}


