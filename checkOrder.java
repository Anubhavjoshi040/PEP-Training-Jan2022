// Anubhav Joshi
// Write a program that accepts three numbers from the user and prints "increasing" if
// the numbers are in increasing order, "decreasing" if the numbers are in decreasing
// order, and "Neither Increasing nor Decreasing" otherwise.


package com.anubhav.pep;
import java.util.Scanner;
public class checkOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ( a < b && b < c){
            System.out.println("Increasing");
        }
        else if ( a > b && b > c){
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither Increasing nor Decreasing");
        }
    }
}
