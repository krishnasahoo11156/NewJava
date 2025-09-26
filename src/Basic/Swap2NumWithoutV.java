package Basic;

import java.util.Scanner;

public class Swap2NumWithoutV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        //Swapping without the help of a third variable
        
       num1 = num1 + num2;  
       num2 = num1 - num2; 
       num1 =  num1 - num2;  

        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        sc.close();
    }
}
