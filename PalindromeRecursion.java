import java.util.Scanner;

public class PalindromeRecursion {
    static String PalRec(String s, int index){
        String test = "";
        if (s.length()<=0) {
            return test+=s.charAt(index);
        } else {
            return test+=s.charAt(index-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to check: ");
        String str = sc.next();
        if (PalRec(str, str.length()-1).equals(str)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
}
