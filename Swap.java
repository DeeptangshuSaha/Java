import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2:");
        int num2 = sc.nextInt();
        System.out.println("Num1: "+num1+"\nNum2: "+num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Num1: "+num1+"\nNum2: "+num2);
        sc.close();
    }
}
