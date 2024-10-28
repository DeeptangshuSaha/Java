import java.util.Scanner;

public class Ap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Value of A:");
    int a = sc.nextInt();
    System.out.println("Enter the Value of B:");
    int b = sc.nextInt();
    System.out.println("Enter the number of terms:");
    int n = sc.nextInt();
    int i =0;
    do {
      System.out.print(a + " ");
      a += b;
      i++;
    } while (i<n);
    sc.close();
  }
}
