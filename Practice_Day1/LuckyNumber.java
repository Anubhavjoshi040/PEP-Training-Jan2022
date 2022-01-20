//Anubhav Joshi

package com.anubhav.pep;
import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lucky = 22;
        int num = input.nextInt();
        while(num != lucky){

            if(num > lucky){
                System.out.println("Too high, Try again.");
                num = input.nextInt();
            }
            else {
                System.out.println("Too low, Try again.");
                num = input.nextInt();
            }
        }

    }
}
