import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the weight in kilograms: ");
    int weight = sc.nextInt();
    System.out.print("Enter the height in meters: ");
    float height = sc.nextFloat();
    System.out.println("BMI is " + (weight / (height * height)));
    sc.close();
  }
}
