// Anubhav Joshi

// Write a program to check a number is even or not

package com.anubhav.pep;

import java.util.Scanner;

public class checkEven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i = input.nextInt();

        if(i%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
