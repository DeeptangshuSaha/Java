import java.util.Scanner;

public class Mathh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        int a = sc.nextInt();
        System.out.print("Enter a number B: ");
        int b = sc.nextInt();
        System.out.println("Max is: "+Math.max(a, b));
        System.out.println("Min is: "+Math.min(a, b));
        System.out.println("Absolute value of -23.453 is "+Math.abs(-23.453));
        System.out.println("Square Root of them is ↓"+"\nfor A"+Math.sqrt(a)+" "+"\nfor B"+Math.sqrt(b));
        System.out.println(Math.round((Math.random()*10))+40);
        sc.close();
    }
}
