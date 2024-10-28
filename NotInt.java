import java.util.Scanner;

public class NotInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        // int a = -1;
        while (a < 0 ) {
            System.out.print("Please Enter a valid number : ");
            try {
                a = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                a = -1;
            }
            a = -1;
        }
        System.out.println(a);
        sc.close();
    }
}
