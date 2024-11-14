import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to check: ");
        int num = sc.nextInt();
        int c =0;
        for(int i=2; i<(num/2)+1;i++){
            if (num%i == 0) {
                c+=1;
                break;
            }
        }
        if (c>0) {
            System.out.println("Not a prime.");
        } else if (num == 1) {
            System.out.println("Neither Prime nor Composite.");
        } else {
            System.out.println("Prime");
        }
        sc.close();
    }
}
