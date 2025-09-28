package Assignments;

import java.util.Scanner;
public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation that you have to perform : ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int ans;
        if(operator == '+'){
            ans = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + ans);

        }

        else if(operator == '-'){
            ans = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + ans);

        }

        else if(operator == '*'){
            ans = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + ans);

        }

        else if(operator == '/'){
            ans = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + ans);

        }

        else if (operator == '%'){
            ans = num1%num2;
            System.out.println(num1 + " % " + num2 + " = " + ans);

        }

        else{
            System.out.println("Enter valid inputs.");
        }
        //System.out.println(num1 + " " + operator + " " + num2 + " = " + ans);

    }
}
