import java.util.Scanner;

public class CheckArm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        int numCheck = (int) num;
        int num2 = 0;
        do {
            num2 += (num%10) * (num%10) * (num%10);
            num = num / 10;
        } while (num>0);
        // System.out.println(num2+" "+numCheck);
        if (num2 == numCheck) {
            System.out.println("Its an armstrong!!");
        } else {
            System.out.println("Its breech!!!!!!!!!");
        }
        sc.close();
    }
}
