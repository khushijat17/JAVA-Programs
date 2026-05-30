/*write application that take a series of integers in pair(e.g. (a,b)) and find the following
i) Is first one is greater ii) Is both are even iii) They are relatively prime or not */

import java.util.Scanner;

class App22 {

    // Method to find GCD
    public static int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // (i) Check greater
        if(num1 > num2){
            System.out.println("Yes, first one is greater than second number.");
        } else if(num1 < num2){
            System.out.println("No, second is greater than first number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        // (ii) Check even
        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Yes, both are even.");
        } else {
            System.out.println("No, both are not even.");
        }

        // (iii) Check relatively prime
        if(gcd(num1, num2) == 1){
            System.out.println("Numbers are relatively prime.");
        } else {
            System.out.println("Numbers are not relatively prime.");
        }

        sc.close();
    }
}