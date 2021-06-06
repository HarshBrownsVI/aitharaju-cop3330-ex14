/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;

public class Ex14
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double amt;
        double tax;
        String state;
        System.out.print("What is the order amount?");
        amt = kb.nextDouble();
        System.out.print("What is the state?");
        state = kb.next();

        if(state.equals("WI"))
        {
            System.out.println("The subtotal is $" + amt);
            tax = 0.55;
            System.out.println("The tax is: $" + tax);
            amt = amt + tax;

        }
        System.out.println("The total is: $" + amt);
    }

}