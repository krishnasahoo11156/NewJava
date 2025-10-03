package Methods;

import java.util.Scanner;
public class Grade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        System.out.println("Your grade is : " + grade(marks));
    }

    private static String grade(int marks) {
        if(91 <= marks && 100>= marks){
            return "AA";
        }
        else if(81 <= marks && 90>= marks){
            return "AB";
        }
        else if(71 <= marks && 80>= marks){
            return "BB";
        }
        else if(61 <= marks && 70>= marks){
            return "BC";
        }
        else if(51 <= marks && 60>= marks){
            return "CD";
        }
        else if(41 <= marks && 50>= marks){
            return "DD";
        }
        else if(0 <= marks && 40>= marks){
            return "Fail";
        }
        else{
            return "ERROR : Please enter valid marks.";
        }

    }
}
