import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.println(num+"! = "+fact(num));
        sc.close();
    }

    public static int fact(int n){
        if (n==0) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
}
