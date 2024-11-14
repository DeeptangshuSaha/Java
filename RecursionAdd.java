import java.util.Scanner;

public class RecursionAdd {

    static int Add(int n){
        if (n==1){
            return 1;
        } else {
            return n + Add(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to find sum: ");
        int num = sc.nextInt();
        System.out.println(Add(num));
        sc.close();
    }
}
