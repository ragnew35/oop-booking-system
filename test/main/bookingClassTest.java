/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 50073058
 */
public class bookingClassTest {
    
    public bookingClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setBookingID method, of class bookingClass.
     */
    @Test
    public void testSetBookingID() {
        System.out.println("setBookingID");
        int BookingID = 9034;
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.setBookingID(BookingID);
        assertEquals(BookingID, instance.getBookingID());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBookingID method, of class bookingClass.
     */
    @Test
    public void testGetBookingID() {
        System.out.println("getBookingID");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        int expResult = 9034;
        int result = instance.getBookingID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomID method, of class bookingClass.
     */
    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        String RoomID = "RM123";
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.setRoomID(RoomID);
        assertEquals(RoomID, instance.getRoomID());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomID method, of class bookingClass.
     */
    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        String expResult = "RM-1234";
        String result = instance.getRoomID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setdate method, of class bookingClass.
     */
    @Test
    public void testSetdate() {
        System.out.println("setdate");
        String date = "23/4/2024";
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.setdate(date);
        assertEquals(date, instance.getdate());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getdate method, of class bookingClass.
     */
    @Test
    public void testGetdate() {
        System.out.println("getdate");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        String expResult = "23/4/2024";
        String result = instance.getdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of settime method, of class bookingClass.
     */
    @Test
    public void testSettime() {
        System.out.println("settime");
        String time = "9:00";
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.settime(time);
        assertEquals(time, instance.gettime());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gettime method, of class bookingClass.
     */
    @Test
    public void testGettime() {
        System.out.println("gettime");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        String expResult = "9:00";
        String result = instance.gettime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setcontactPerson method, of class bookingClass.
     */
    @Test
    public void testSetcontactPerson() {
        System.out.println("setcontactPerson");
        String contactPerson = "John";
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.setcontactPerson(contactPerson);
        assertEquals(contactPerson, instance.getcontactPerson());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getcontactPerson method, of class bookingClass.
     */
    @Test
    public void testGetcontactPerson() {
        System.out.println("getcontactPerson");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        String expResult = "John";
        String result = instance.getcontactPerson();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setcontactEmail method, of class bookingClass.
     */
    @Test
    public void testSetcontactEmail() {
        System.out.println("setcontactEmail");
        String contactEmail = "john@email.com";
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.setcontactEmail(contactEmail);
        assertEquals(contactEmail, instance.getcontactEmail());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getcontactEmail method, of class bookingClass.
     */
    @Test
    public void testGetcontactEmail() {
        System.out.println("getcontactEmail");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        String expResult = "john@email.com";
        String result = instance.getcontactEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setcontactPhone method, of class bookingClass.
     */
    @Test
    public void testSetcontactPhone() {
        System.out.println("setcontactPhone");
        String contactPhone = "074260936478";
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        instance.setcontactPhone(contactPhone);
        assertEquals(contactPhone, instance.getcontactPhone());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getcontactPhone method, of class bookingClass.
     */
    @Test
    public void testGetcontactPhone() {
        System.out.println("getcontactPhone");
        bookingClass instance = new bookingClass(9034, "RM-1234", "23/4/2024", "9:00", "John", "john@email.com", "074260936478");
        String expResult = "074260936478";
        String result = instance.getcontactPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
