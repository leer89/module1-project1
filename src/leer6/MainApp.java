/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

import java.util.Scanner;

/**
 *
 * @author RandyLee
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        String first;
        String last;

        System.out.print(
                "Enter your first and last name separated by a space: ");
        first = stdin.next();
        last = stdin.next();

        System.out.println("Your initials are: "
                + first.charAt(0) + last.charAt(0) + ".");
    }
}
