import java.util.Scanner;

public class divisionmistake {
  public static void main(String[] args) {

    //Global Variables
    Scanner ins = new Scanner(System.in);
    int numerator, denominator;

    // Propmt
    System.out.print("Enter Numerator: ");
    numerator = ins.nextInt();
    System.out.print("Enter Denominator: ");
    denominator = ins.nextInt();

    // Catch Error
    try {
      double result = numerator / denominator;
      System.out.println(numerator + "/" + denominator + "=" + result);
    } catch (ArithmeticException mistake) {
      System.out.println("Arithmetic Exception was caught and thrown!");
    }
    System.out.println("End of program");
  }
}
