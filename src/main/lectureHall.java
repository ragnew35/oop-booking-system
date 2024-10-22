/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ragne
 */
public class lectureHall extends roomClass {
     private String microphoneType;
    private String tieredSeating;
    
    public lectureHall(String RoomID, int roomNumber, int floor, int capacity, String microphoneType, String tieredSeating){
        super(RoomID, roomNumber, floor, capacity);
        this.microphoneType = microphoneType;
        this.tieredSeating = tieredSeating;
    }
    
    public void setmicrophoneType(String microphoneType){
        this.microphoneType = microphoneType;
    }
    
    public String getmicrophoneType(){
        return this.microphoneType;
    }
    
    public void settieredSeating(String tieredSeating){
        this.tieredSeating = tieredSeating;
    }
    
    public String gettieredSeating(){
        return this.tieredSeating;
    } 

}
