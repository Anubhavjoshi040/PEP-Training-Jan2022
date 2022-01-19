// Anubhav Joshi
// Write a program to enter the numbers till the user wants and at the end it should
// display the count of positive, negative and zeros entered.

package com.anubhav.pep;
import java.util.Scanner;
public class countNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        String check;
        do{
            System.out.println("Enter a number: ");
            int i = input.nextInt();
            if(i > 0){
                positive++;
            }
            else if (i < 0){
                negative++;
            }
            else zeros++;
            System.out.println("Press 'y' to continue and 'n' to exit.");
            check = input.next();
        }while(check.equals("y"));
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);
    }
}
