/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constans;

/**
 *
 * @author Garll
 */
public class Constans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHight = 11;
        System.out.println("Paper size in centimeters : "
                + paperWidth * CM_PER_INCH + " by " + paperHight * CM_PER_INCH);
    }
    
}
