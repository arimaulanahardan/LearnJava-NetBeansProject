/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatype;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Ari Maulana Hardan
 */
public class DataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int Type = Scan.nextInt();

        for (int i = 0; i < Type; i++) {
            try {
                long Type2 = Scan.nextLong();
                BigInteger BI = BigInteger.valueOf(Type2);

                System.out.println(Type2 + " Can be fitted in : ");

                if (BI.longValue() >= -128 && Type2 <= 127) {
                    System.out.println("* Byte");
                }

                if (BI.longValue() >= -(Math.pow(2, 15)) && BI.longValue() <= (Math.pow(2, 15) - 1)) {
                    System.out.println("* Short");
                }

                if (BI.longValue() >= -(Math.pow(2, 31)) && BI.longValue() <= Math.pow(2, 31) - 1) {
                    System.out.println("* Int");
                }

                if (BI.longValue() >= -(Math.pow(2, 63)) && BI.longValue() <= Math.pow(2, 63)) {
                    System.out.println("* Long");
                }
            } catch (Exception e) {
                System.out.println(Scan.next() + " Can't be fitted anywhere.");
            }
        }
    }

}
