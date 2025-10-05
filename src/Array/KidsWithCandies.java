package Array;
import java.util.*;
public class KidsWithCandies {
      // For Scanner and List

        // Method to solve the problem
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>();

            // Find the maximum candies any kid currently has
            int maxCandies = 0;
            for (int candy : candies) {
                if (candy > maxCandies) {
                    maxCandies = candy;
                }
            }

            // Check for each kid if they can reach the max
            for (int candy : candies) {
                result.add(candy + extraCandies >= maxCandies);
            }

            return result;
        }

        // Main method to take input and print output
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take number of kids (array size)
            System.out.print("Enter number of kids: ");
            int n = sc.nextInt();

            int[] candies = new int[n];

            // Take candies input
            System.out.println("Enter candies for each kid:");
            for (int i = 0; i < n; i++) {
                candies[i] = sc.nextInt();
            }

            // Take extra candies input
            System.out.print("Enter extra candies: ");
            int extraCandies = sc.nextInt();

            // Call the function
            List<Boolean> result = kidsWithCandies(candies, extraCandies);

            // Print result
            System.out.println("Kids with greatest number of candies: " + result);

            // Optional: Print in a nicer format
            System.out.print("Result (true = can be greatest): ");
            for (Boolean b : result) {
                System.out.print(b + " ");
            }

            sc.close();
        }
    }

