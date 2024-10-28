import java.util.Scanner;

public class FindEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int a = sc.nextInt();
        switch (a%2) {
            case 0:
                System.out.print("The number is Even");
                break;
            default:
                System.out.print("The number is Odd");
                break;
        }
        sc.close();
    }
}
