import java.util.Scanner;

public class stringmanipulation {
  public static void main(String[] args) {

    // Global Variables
    Scanner ins = new Scanner(System.in);
    String str1, str2, str3;

    // System Prompt
    System.out.print("Input String 1: ");
    str1 = ins.nextLine();
    System.out.print("Input String 2: ");
    str2 = ins.nextLine();
    System.out.print("Input String 3: ");
    str3 = ins.nextLine();

    System.out.println();

    // Length of String
    System.out.printf("%-25s %d%n", "Length of String 1:", str1.length());
    System.out.printf("%-25s %d%n", "Length of String 2:", str2.length());
    System.out.printf("%-25s %d%n", "Length of String 3:", str3.length());

    System.out.println();

    // Replace Spaces with Asterisks in String 1, 2, 3
    System.out.printf("%-25s %s%n", "String 1:", str1.replace(' ', '*'));
    System.out.printf("%-25s %s%n", "String 2:", str2.replace(' ', '*'));
    System.out.printf("%-25s %s%n", "String 3:", str3.replace(' ', '*'));

    System.out.println();

    // Concatenate String 1 and 2, String 2 and 3, all strings
    System.out.printf("%-25s %s%n", "String 1 and 2:", str1 + str2);
    System.out.printf("%-25s %s%n", "String 2 and 3:", str2 + str3);
    System.out.printf("%-25s %s%n", "All strings:", str1 + str2 + str3);

    System.out.println();

    // Compare String 1 and 2, String 2 and String 3, String 3 and 1
    System.out.printf("%-25s %d%n", "String 1 and 2:", str1.compareTo(str2));
    System.out.printf("%-25s %d%n", "String 2 and 3:", str2.compareTo(str3));
    System.out.printf("%-25s %d%n", "String 3 and 1:", str3.compareTo(str1));

    ins.close();
  }
}
