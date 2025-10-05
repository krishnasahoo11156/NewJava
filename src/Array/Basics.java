package Array;

public class Basics {
    public static void main(String[] args) {


        int[] arr1 = new int[5];
        arr1 = new int[] {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        int[] arr2 = {9,8,7,6,5,4};
        for(int i = 0; i < 5; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        int[] arr3 = new int[5];
        arr3[2] = 1;
        for(int i = 0; i < 5; i++){
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        int[] arr4 = new int[5];
        arr4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < 6; i++){
            System.out.print(arr4[i] + " ");
        }

        System.out.println();



    }
}
