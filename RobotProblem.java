/* Anubhav Joshi
You are training a robot used to buy groceries and milk. The robot needs to
buy  them in the following order:

1.  It should travel a distance of 20 km
2.  When it has reached 10 kms, you need to print the message  "Buy Groceries".
    Also, it should start its journey back home.
3.  When it is 5 km away from home, you need to print the message "buy milk".
*/
package com.anubhav.pep;

public class RobotProblem {
    public static void main(String[] args) {
        int distance = 0;
        for ( distance = 0; distance < 20; distance++) {
            if(distance == 10){
                System.out.println("Buy Groceries");
            }
            else if(distance == 15){
                System.out.println("Buy milk");
            }

        }

    }
}
