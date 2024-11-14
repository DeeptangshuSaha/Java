import java.util.Scanner;

public class NumberPalindrome {
    static void numPalCheck(int n){
        int numCheck = (int) n;
        int num2 =0;
        while (n>0) {
            num2 *= 10;
            num2 += (n%10);
            n = n / 10;
        }
        // System.out.println(num2);
        if (numCheck == num2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        numPalCheck(num);
        sc.close();
    }
}
