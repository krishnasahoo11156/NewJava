package Assignments;

import java.util.Scanner;
public class GreetingMessage {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Welcome to the world of code " + name);

    }
}
