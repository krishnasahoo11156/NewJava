package Basic;

import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        System.out.println("With trim keyword : " + ch.trim());
        System.out.println("Without trim Keyword : " + ch);
        System.out.println("With charAt for 0th index : " + ch.charAt(0));
        
        //System.out.println(in.next());
        sc.close();
    }
}
