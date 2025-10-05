package TwoDimensionalArray;

import java.util.Scanner;
public class RichestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of bank accounts : ");
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        System.out.println("Enter the account details : ");
        for(int i = 0; i<accounts.length; i++){
            for(int j =0; j<accounts[i].length; j++){
                accounts[i][j] = sc.nextInt();
            }
        }

        System.out.print("Richest sum is : " + maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int supermax = 0;
        for(int i = 0; i<accounts.length; i++){
            int max = 0;
            for(int j =0; j<accounts[i].length; j++){
                max += accounts[i][j];
            }
            supermax = Math.max(max,supermax);
        }
        return supermax;
    }
}
