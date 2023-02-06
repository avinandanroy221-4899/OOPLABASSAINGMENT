/*
 * . Make a Simple Calculator. Find out the Summation, Subtraction,
     Multiplication and Division of two integers. 
 */

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("The summation is : " + (a+b));
        System.out.println("The substraction is : "+ (a-b));
        System.out.println("The multiplication is : " + (a*b));
        System.out.println("The division is : " + (a/b));

    }
    
}
