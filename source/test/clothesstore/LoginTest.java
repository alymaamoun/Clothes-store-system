/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clothesstore;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.Action;
/**
 *
 * @author user
 */
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of getLOGIN method, of class Login.
     */
    @Test
    public void testGetLOGIN() throws InterruptedException {
        
        Login login=new Login();
        login.setVisible(true);
        login.setUSERNAME("Aly");
        login.setUSERTYPE("Cashier");
        login.setPASSWORD("lolbiglo");
        login.setLOGIN();
        assertFalse(login.isActive());
        
        

    }

    /**
     * Test of setLOGIN method, of class Login.
     */
    @Test
    public void testSetLOGIN() {
    }

    /**
     * Test of getPASSWORD method, of class Login.
     */
    @Test
    public void testGetPASSWORD() {
    }

    /**
     * Test of setPASSWORD method, of class Login.
     */
    @Test
    public void testSetPASSWORD() {
    }

    /**
     * Test of getUSERNAME method, of class Login.
     */
    @Test
    public void testGetUSERNAME() {
    }

    /**
     * Test of setUSERNAME method, of class Login.
     */
    @Test
    public void testSetUSERNAME() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
    }
    
}
