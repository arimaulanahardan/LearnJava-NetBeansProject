/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellojava;

import java.util.Scanner;

/**
 *
 * @author Ari Maulana Hardan
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Total = 0, Compare;
        String InputValue;
        Scanner Scan = new Scanner(System.in);
        System.out.print(" Input : ");
        InputValue = Scan.nextLine();

        String[] NewString = InputValue.split("\\s+");

        for (int i = 0; i < 2; i++) {
            Total += NewString[i].length();
        }

        System.out.println(Total);
        Compare = NewString[0].compareTo(NewString[1]);

        if (Compare < 0) {
            System.out.println("No");
        } else if (Compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Equal");
        }

        for (int i = 0; i < 2; i++) {
            String FirstLetter = NewString[i].substring(0, 1);
            String RemainingLetter = NewString[i].substring(1, NewString[i].length());
            FirstLetter = FirstLetter.toUpperCase();
            NewString[i] = FirstLetter + RemainingLetter;
        }

        System.out.println(NewString[0] + " " + NewString[1]);
    }
}
