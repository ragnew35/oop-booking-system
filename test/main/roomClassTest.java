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
public class roomClassTest {
    
    public roomClassTest() {
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
     * Test of setRoomID method, of class roomClass.
     */
    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        String RoomID = "RM-123";
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        instance.setRoomID(RoomID);
        assertEquals(RoomID, instance.getRoomID());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomID method, of class roomClass.
     */
    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        String expResult = "RM-123";
        String result = instance.getRoomID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setroomNumber method, of class roomClass.
     */
    @Test
    public void testSetroomNumber() {
        System.out.println("setroomNumber");
        int roomNumber = 3;
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        instance.setroomNumber(roomNumber);
        assertEquals(roomNumber, instance.getroomNumber());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getroomNumber method, of class roomClass.
     */
    @Test
    public void testGetroomNumber() {
        System.out.println("getroomNumber");
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        int expResult = 3;
        int result = instance.getroomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setfloor method, of class roomClass.
     */
    @Test
    public void testSetfloor() {
        System.out.println("setfloor");
        int floor = 2;
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        instance.setfloor(floor);
        assertEquals(floor, instance.getfloor());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getfloor method, of class roomClass.
     */
    @Test
    public void testGetfloor() {
        System.out.println("getfloor");
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        int expResult = 2;
        int result = instance.getfloor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setcapacity method, of class roomClass.
     */
    @Test
    public void testSetcapacity() {
        System.out.println("setcapacity");
        int capacity = 5;
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        instance.setcapacity(capacity);
        assertEquals(capacity, instance.getcapacity());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getcapacity method, of class roomClass.
     */
    @Test
    public void testGetcapacity() {
        System.out.println("getcapacity");
        roomClass instance = new roomClass("RM-123", 3, 2, 5);
        int expResult = 5;
        int result = instance.getcapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
