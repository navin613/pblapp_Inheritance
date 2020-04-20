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
public class VideoStoreTest {
    
    public VideoStoreTest() {
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
     * Test of addVideo method, of class VideoStore.
     */
    @Test
    public void testAddVideo() {
        System.out.println("addVideo");
        String name = "";
        VideoStore instance = new VideoStore();
        instance.addVideo(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doCheckout method, of class VideoStore.
     */
    @Test
    public void testDoCheckout() {
        System.out.println("doCheckout");
        String name = "";
        VideoStore instance = new VideoStore();
        instance.doCheckout(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doReturn method, of class VideoStore.
     */
    @Test
    public void testDoReturn() {
        System.out.println("doReturn");
        String name = "";
        VideoStore instance = new VideoStore();
        instance.doReturn(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveRating method, of class VideoStore.
     */
    @Test
    public void testReceiveRating() {
        System.out.println("receiveRating");
        String name = "";
        int rating = 0;
        VideoStore instance = new VideoStore();
        instance.receiveRating(name, rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listInventory method, of class VideoStore.
     */
    @Test
    public void testListInventory() {
        System.out.println("listInventory");
        VideoStore instance = new VideoStore();
        instance.listInventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
