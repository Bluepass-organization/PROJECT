/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benja
 */
public class LoginFrameIT {
    
    public LoginFrameIT() {
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
     * Test of setLayoutManager method, of class LoginFrame.
     */
    @Test
    public void testSetLayoutManager() {
        System.out.println("setLayoutManager");
        LoginFrame instance = new LoginFrame();
        instance.setLayoutManager();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocationAndSize method, of class LoginFrame.
     */
    @Test
    public void testSetLocationAndSize() {
        System.out.println("setLocationAndSize");
        LoginFrame instance = new LoginFrame();
        instance.setLocationAndSize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addComponentsToContainer method, of class LoginFrame.
     */
    @Test
    public void testAddComponentsToContainer() {
        System.out.println("addComponentsToContainer");
        LoginFrame instance = new LoginFrame();
        instance.addComponentsToContainer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class LoginFrame.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        LoginFrame instance = new LoginFrame();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class LoginFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] a = null;
        LoginFrame instance = new LoginFrame();
        instance.main(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
