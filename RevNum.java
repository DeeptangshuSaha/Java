import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int num2 =0;
        while (num>0) {
            num2 *= 10;
            num2 += (num%10);
            num = num / 10;
        }
        System.out.println(num2);
        sc.close();
    }
}
