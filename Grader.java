import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int marks = sc.nextInt();
        if (marks>=90 && marks<=100) {
            System.out.println("Grade A");
        } else if (marks<90 && marks>=80) {
            System.out.println("Grade B");
        } else if (marks<80 && marks>=70) {
            System.out.println("Grade C");
        } else if (marks<70 && marks>=30) {
            System.out.println("Grade D");
        } else if (marks<30) {
            System.out.println("Grade FAIL!!!!!");   
        } else {
            System.out.println("Invalid Value");
        }
        sc.close();
    }
}
