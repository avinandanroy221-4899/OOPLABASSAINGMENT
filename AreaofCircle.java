/*
 * Find the area of a Circle. [Print 2 digits after decimal point].
 */

import java.util.Scanner;

public class AreaofCircle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();

        double pi = 3.1416;

        double area = pi*r*r;

        System.out.printf("The area of circle is : %.2f\n",area);
    }
}
