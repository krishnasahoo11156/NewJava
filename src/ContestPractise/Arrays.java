package ContestPractise;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<num; i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = {5,4,3,2,1,0};
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        sc.close();





            //Basics
//        int[] marks = new int[3];
//        marks[0] = 13;
//        marks[1] = 10;
//        marks[2] = 20;
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

    }

}
