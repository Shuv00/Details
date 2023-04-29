/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.details.java;
import javax.swing.JOptionPane;
/**
 *
 * @author SHUVO
 */
public class DetailsJava {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter Your Name");
        String age = JOptionPane.showInputDialog(null, "Enter your age");
        String location = JOptionPane.showInputDialog(null, "Enter youtr Address");
        JOptionPane.showMessageDialog(null, "Hi " + name);
         JOptionPane.showMessageDialog(null, "Your age is " + age);
          JOptionPane.showMessageDialog(null, "Your location " + location);
        
    }
}
