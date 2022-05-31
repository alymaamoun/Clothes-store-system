/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clothesstore;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.*;


public class ClothesStore {

    /**
     * @param args the command line arguments
     */
     @SuppressWarnings("unchecked")
    public static void main(String[] args) throws SQLException  {
       
         try {
            String url = "jdbc:mysql://localhost:3306/clothes?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = DriverManager.getConnection(url, "root", "lolbiglol");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(new JOptionPane(), "No database found!");
             
         }

          


        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClothesStore.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ClothesStore.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClothesStore.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ClothesStore.class.getName()).log(Level.SEVERE, null, ex);
        }
        GUI gui=new GUI();
        gui.appear();
    }
    
}
