import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int term = sc.nextInt();
        System.out.print("0 1 ");
        int x = 0, y = 1, z;
        for (int i=2; i<term; i++){
            z = x+y;
            System.out.print(z+" ");
            x = y;
            y = z;
        }
        sc.close();
    }
}
