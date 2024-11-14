import java.util.Scanner;

public class Palindrome {
    public static boolean palCheck(String a) {
        String rev = "";
        for (int i = a.length()-1; i >= 0; i--) {
            rev += a.charAt(i);
        }
        if (rev.equals(a)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String check = sc.next();
        if (palCheck(check)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }
            
        // String checkCopy = (String) check;

        sc.close();
    }
}
