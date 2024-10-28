import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to check: ");
        int a = sc.nextInt();
        System.out.println((a%2==0) ? "Even": "Not Even");
        sc.close();
    }
}
