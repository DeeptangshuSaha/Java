import java.util.Scanner;

public class IndiDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to separate: ");
        int num = sc.nextInt();
        while (num>0) {
            System.out.println(num%10);
            num = num / 10;
        }
        sc.close();
    }
}
