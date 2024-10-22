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
public class labRoomTest {
    
    public labRoomTest() {
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
     * Test of setNumberPCs method, of class labRoom.
     */
    @Test
    public void testSetNumberPCs() {
        System.out.println("setNumberPCs");
        int numberPCs = 5;
        labRoom instance = new labRoom("RM-123", 2, 3, 4, 5, "Windows"); 
        instance.setNumberPCs(numberPCs);
        assertEquals(numberPCs, instance.getNumberPCs());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberPCs method, of class labRoom.
     */
    @Test
    public void testGetNumberPCs() {
        System.out.println("getNumberPCs");
        labRoom instance = new labRoom("RM-123", 2, 3, 4, 5, "Windows"); 
        int expResult = 5;
        int result = instance.getNumberPCs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setoperatingSystem method, of class labRoom.
     */
    @Test
    public void testSetoperatingSystem() {
        System.out.println("setoperatingSystem");
        String operatingSystem = "Windows";
        labRoom instance = new labRoom("RM-123", 2, 3, 4, 5, "Windows"); 
        instance.setoperatingSystem(operatingSystem);
        assertEquals(operatingSystem, instance.getoperatingSystem());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getoperatingSystem method, of class labRoom.
     */
    @Test
    public void testGetoperatingSystem() {
        System.out.println("getoperatingSystem");
        labRoom instance = new labRoom("RM-123", 2, 3, 4, 5, "Windows"); 
        String expResult = "Windows";
        String result = instance.getoperatingSystem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
