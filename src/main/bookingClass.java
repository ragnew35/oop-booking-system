/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ragne
 */
public class bookingClass {
    private int BookingID;
    private String RoomID;
    private String date;
    private String time;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    
    public bookingClass(int BookingID, String RoomID, String date, String time, String contactPerson, String contactEmail, String contactPhone){
        this.BookingID = BookingID;
        this.RoomID = RoomID;
        this.date = date;
        this.time = time;
        this.contactPerson = contactPerson;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }
    
    public void setBookingID(int BookingID){
        this.BookingID = BookingID;
    }
    
    public int getBookingID(){
        return this.BookingID;
    }
    
    public void setRoomID(String RoomID){
        this.RoomID = RoomID;
    }
    
    public String getRoomID(){
        return this.RoomID;
    }
    
    public void setdate(String date){
        this.date = date;
    }
    
    public String getdate(){
        return this.date;
    }
    
    public void settime(String time){
        this.time = time;
    }
    
    public String gettime(){
        return this.time;
    }
    
    public void setcontactPerson(String contactPerson){
        this.contactPerson = contactPerson;
    }
    
    public String getcontactPerson(){
        return this.contactPerson;
    }
    
    public void setcontactEmail(String contactEmail){
        this.contactEmail = contactEmail;
    }
    
    public String getcontactEmail(){
        return this.contactEmail;
    }
    
    public void setcontactPhone(String contactPhone){
        this.contactPhone = contactPhone;
    }
    
    public String getcontactPhone(){
        return this.contactPhone;
    }
}


