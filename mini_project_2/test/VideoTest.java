/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class VideoTest {
    
    public VideoTest() {
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
     * Test of getName method, of class Video.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Video instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doCheckout method, of class Video.
     */
    @Test
    public void testDoCheckout() {
        System.out.println("doCheckout");
        Video instance = null;
        instance.doCheckout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doReturn method, of class Video.
     */
    @Test
    public void testDoReturn() {
        System.out.println("doReturn");
        Video instance = null;
        instance.doReturn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveRating method, of class Video.
     */
    @Test
    public void testReceiveRating() {
        System.out.println("receiveRating");
        int rating = 0;
        Video instance = null;
        instance.receiveRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class Video.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Video instance = null;
        int expResult = 0;
        int result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckout method, of class Video.
     */
    @Test
    public void testGetCheckout() {
        System.out.println("getCheckout");
        Video instance = null;
        boolean expResult = false;
        boolean result = instance.getCheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
