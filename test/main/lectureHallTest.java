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
public class lectureHallTest {
    
    public lectureHallTest() {
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
     * Test of setmicrophoneType method, of class lectureHall.
     */
    @Test
    public void testSetmicrophoneType() {
        System.out.println("setmicrophoneType");
        String microphoneType = "mic";
        lectureHall instance = new lectureHall("RM-123", 1, 2, 3, "mic", "Yes");
        instance.setmicrophoneType(microphoneType);
        assertEquals(microphoneType, instance.getmicrophoneType());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getmicrophoneType method, of class lectureHall.
     */
    @Test
    public void testGetmicrophoneType() {
        System.out.println("getmicrophoneType");
        lectureHall instance = new lectureHall("RM-123", 1, 2, 3, "mic", "Yes");
        String expResult = "mic";
        String result = instance.getmicrophoneType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of settieredSeating method, of class lectureHall.
     */
    @Test
    public void testSettieredSeating() {
        System.out.println("settieredSeating");
        String tieredSeating = "Yes";
        lectureHall instance = new lectureHall("RM-123", 1, 2, 3, "mic", "Yes");
        instance.settieredSeating(tieredSeating);
        assertEquals(tieredSeating, instance.gettieredSeating());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gettieredSeating method, of class lectureHall.
     */
    @Test
    public void testGettieredSeating() {
        System.out.println("gettieredSeating");
        lectureHall instance = new lectureHall("RM-123", 1, 2, 3, "mic", "Yes");
        String expResult = "Yes";
        String result = instance.gettieredSeating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
