import java.util.Scanner;

public class OverloadMethod {
    static int Sum(int a, int b) {
        return a + b;
    }

    static double Sum(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input Type\nInt -> 1\nDouble -> 2\n->");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You Chose Int");
                System.out.println("Enter A: ");
                int a = sc.nextInt();
                System.out.println("Enter B: ");
                int b = sc.nextInt();
                System.out.println(Sum(a, b));
                break;
            case 2:
                System.out.println("You Chose Double");
                System.out.println("Enter A: ");
                double a_do = sc.nextDouble();
                System.out.println("Enter B: ");
                double b_do = sc.nextDouble();
                System.out.println(Sum(a_do, b_do));
                break;
            default:
                System.out.println("Wrong Input try again");
                break;
        }
        sc.close();
    }
}
