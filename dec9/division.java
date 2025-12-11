import java.util.Scanner;

public class division {
  public static void main(String[] args) {

    //Global Variables
    Scanner ins = new Scanner(System.in);
    int numerator, denominator;

    // Propmt
    System.out.print("Enter Numerator: ");
    numerator = ins.nextInt();
    System.out.print("Enter Denominator: ");
    denominator = ins.nextInt();

    double result = numerator / denominator;
    System.out.println(numerator + "/" + denominator + "=" + result); 
  }
}
