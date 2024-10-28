import java.util.Scanner;

public class NegAP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the A term: ");
    int a = sc.nextInt();
    System.out.println("Enter the Common Diff: ");
    int diff = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    int n = sc.nextInt();
    int num = 0, i=0, j=0;
    do {
      num = a - (i * diff);
      System.out.print(num + " ");
      j++;
      i+=2;
    }while(j<n);
    sc.close();
  }
}
