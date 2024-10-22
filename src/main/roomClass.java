/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ragne
 */
public class roomClass {
    private String RoomID;
    private int roomNumber;
    private int floor;
    private int capacity;
    
    public roomClass(String RoomID, int roomNumber, int floor, int capacity){
        this.RoomID = RoomID;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
    }
    
    public void setRoomID(String RoomID){
        this.RoomID = RoomID;
    }
    
    public String getRoomID(){
        return this.RoomID;
    }
    
    public void setroomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    
    public int getroomNumber(){
        return this.roomNumber;
    }
    
    public void setfloor(int floor){
        this.floor = floor;
    }
    
    public int getfloor(){
        return this.floor;
    }
    
    public void setcapacity(int capacity){
        this.capacity = capacity;
    }
    
    public int getcapacity(){
        return this.capacity;
    }
    
    
}


