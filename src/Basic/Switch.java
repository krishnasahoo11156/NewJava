package Basic;

import java.util.Locale;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next().toLowerCase();
//        String name2 = name1.toLowerCase();

        switch (name1) {
            case "krishna" -> System.out.println("The GOD");
            case "rishabh" -> System.out.println("My friend");
            case "rugved" -> System.out.println("My PA");
            default -> System.out.println("This is a common name");
        }



        int days = sc.nextInt();

        switch (days) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
        }

    }
}
