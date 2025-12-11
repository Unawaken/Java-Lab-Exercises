import java.util.Scanner;

public class LabActivity2 {
  public static void main(String[] args) {

    // Global Variables
    Scanner ins = new Scanner(System.in);
    String userName = "CHRIS";
    String password = "042201";
    int tries = 0;
    boolean isLoggedIn = false;

    // System Prompt
    System.out.print("Lab Activity 2\nNovember 28, 2025\nProgrammed by: De Luna, Emman Christopher R.\n\n");

    // Login Loop (One time thing)
    while (tries < 3) {
      //Login Prompt
      System.out.print("*** Login User Credentials ***\n\nInput Username: ");
      String insUserName = ins.nextLine();
      System.out.print("Input Password: ");
      String insPassword = ins.nextLine();

      // Convert inputs to uppercase
      String upperUserName = insUserName.toUpperCase();
      String upperPassword = insPassword.toUpperCase();

      // Login Logic (Compare with uppercase versions of stored credentials)
      if (upperUserName.equals(userName.toUpperCase()) && upperPassword.equals(password.toUpperCase())) {
        System.out.print("Login Successful!!!\n\n");
        isLoggedIn = true;
        break; // Exit the login loop
      } else {
        System.out.print("Wrong Credentails Entered. Please Try Again.\n");
        tries++;
      }
    }

    // Main Program Loop (Only if logged in)
    if (isLoggedIn) {
      int choice = 0;
      do {
         //Menu Prompt
         System.out.print("Welcome to Lab Activity 2!!!\n\nInput the Program of your choice :)\n1.) Array Sum and Average\n2.) Array Operators Highest_Lowest\n3.) String Methods\n4.) Exit\n\nEnter Choice: ");
         choice = ins.nextInt();
         ins.nextLine(); // Consume newline left by nextInt

         // Empty Arrays with Custom Sizes (Case 1 & 2)
         int arraySize1 = 0, arraySize2 = 0;
         long[] inputArray1;
         long[] inputArray2;
         long[] sum;

         //Program Containers
         switch (choice) {
           case 1:
             System.out.println("-----------------------------------------");
             System.out.println("          Array Sum and Average          ");
             System.out.println("-----------------------------------------");
             System.out.print("Input Array Size (for both arrays): ");
             int commonSize = ins.nextInt();
             arraySize1 = commonSize;
             arraySize2 = commonSize;
             
             inputArray1 = new long[commonSize];
             inputArray2 = new long[commonSize];

             System.out.println("\n[Input Values for Array 1]");
             for (int i = 0; i < commonSize; i++) {
               System.out.print("Enter number " + (i + 1) + ": ");
               inputArray1[i] = ins.nextLong();
             }

             System.out.println("\n[Input Values for Array 2]");
             for (int i = 0; i < commonSize; i++) {
               System.out.print("Enter number " + (i + 1) + ": ");
               inputArray2[i] = ins.nextLong();
             }
             
             sum = new long[commonSize];

             System.out.println("\n----------------------------------------------------------");
             System.out.println("Array 1\t\t| Array 2\t| Sum\t\t| Average");
             System.out.println("----------------------------------------------------------");
             
             for (int i = 0; i < commonSize; i++) {
               sum[i] = inputArray1[i] + inputArray2[i];
               double avg = sum[i] / 2.0;
               System.out.printf("%d\t\t| %d\t\t| %d\t\t| %.2f%n", inputArray1[i], inputArray2[i], sum[i], avg);
             }
             System.out.println("----------------------------------------------------------\n");
             
             ins.nextLine(); // Consume newline
             break;

           case 2:
             System.out.println("-----------------------------------------");
             System.out.println("         Array Operators Hi_Lo           ");
             System.out.println("-----------------------------------------");
             System.out.print("Input Array Size (for both arrays): ");
             int size2 = ins.nextInt();
             arraySize1 = size2;
             arraySize2 = size2;
             
             inputArray1 = new long[size2];
             inputArray2 = new long[size2];

             System.out.println("\n[Input Values for Array 1]");
             for (int i = 0; i < size2; i++) {
               System.out.print("Enter number " + (i + 1) + ": ");
               inputArray1[i] = ins.nextLong();
             }

             System.out.println("\n[Input Values for Array 2]");
             for (int i = 0; i < size2; i++) {
               System.out.print("Enter number " + (i + 1) + ": ");
               inputArray2[i] = ins.nextLong();
             }

             // Variables for extremes
             long maxA1 = Long.MIN_VALUE, minA1 = Long.MAX_VALUE;
             long maxA2 = Long.MIN_VALUE, minA2 = Long.MAX_VALUE;
             long maxS = Long.MIN_VALUE, minS = Long.MAX_VALUE;
             long maxD = Long.MIN_VALUE, minD = Long.MAX_VALUE;
             long maxP = Long.MIN_VALUE, minP = Long.MAX_VALUE;
             double maxQ = -Double.MAX_VALUE, minQ = Double.MAX_VALUE;

             System.out.println("\n------------------------------------------------------------------------------------------");
             System.out.println("Array 1\t| Array 2\t| Sum\t\t| Diff\t\t| Prod\t\t| Quot");
             System.out.println("------------------------------------------------------------------------------------------");
             for (int i = 0; i < size2; i++) {
                long v1 = inputArray1[i];
                long v2 = inputArray2[i];
                long s = v1 + v2;
                long d = v1 - v2;
                long p = v1 * v2;
                double q = 0.0;
                if (v2 != 0) {
                    q = (double)v1 / v2;
                }
                
                System.out.printf("%d\t| %d\t\t| %d\t\t| %d\t\t| %d\t\t| %.2f%n", v1, v2, s, d, p, q);
                
                // Update extremes
                if (i == 0) {
                    maxA1 = v1; minA1 = v1;
                    maxA2 = v2; minA2 = v2;
                    maxS = s; minS = s;
                    maxD = d; minD = d;
                    maxP = p; minP = p;
                    maxQ = q; minQ = q;
                } else {
                    if (v1 > maxA1) maxA1 = v1;
                    if (v1 < minA1) minA1 = v1;
                    if (v2 > maxA2) maxA2 = v2;
                    if (v2 < minA2) minA2 = v2;
                    if (s > maxS) maxS = s;
                    if (s < minS) minS = s;
                    if (d > maxD) maxD = d;
                    if (d < minD) minD = d;
                    if (p > maxP) maxP = p;
                    if (p < minP) minP = p;
                    if (q > maxQ) maxQ = q;
                    if (q < minQ) minQ = q;
                }
             }
             System.out.println("------------------------------------------------------------------------------------------");
             
             if (size2 > 0) {
                 System.out.printf("%d\t| %d\t\t| %d\t\t| %d\t\t| %d\t\t| %.2f\t| Highest%n", maxA1, maxA2, maxS, maxD, maxP, maxQ);
                 System.out.printf("%d\t| %d\t\t| %d\t\t| %d\t\t| %d\t\t| %.2f\t| Lowest%n", minA1, minA2, minS, minD, minP, minQ);
             } else {
                 System.out.println("-\t| -\t\t| -\t\t| -\t\t| -\t\t| -");
             }
             System.out.println("------------------------------------------------------------------------------------------");
             
             System.out.println();
             ins.nextLine(); // Consume newline
             break;
         
           case 3:
             System.out.println("-----------------------------------------");
             System.out.println("              String Methods             ");
             System.out.println("-----------------------------------------");
             System.out.print("Input String 1: ");
             String string1 = ins.nextLine();
             System.out.print("Input String 2: ");
             String string2 = ins.nextLine();

             // String Methods Results
             System.out.println("\n--- String Method Results ---");
             System.out.println("String 1: \"" + string1 + "\"");
             System.out.println("String 2: \"" + string2 + "\"");
             System.out.println("------------------------------------");

             // Length
             System.out.println("Length of String 1: " + string1.length());
             System.out.println("Length of String 2: " + string2.length());
             System.out.println("------------------------------------");

             // Equals
             boolean isEqual = string1.equals(string2);
             System.out.println("String 1 equals String 2: " + isEqual);
             System.out.println("------------------------------------");

             // Concatenation
             String concatenatedString = string1.concat(string2);
             System.out.println("String 1 concatenated with String 2: \"" + concatenatedString + "\"");
             System.out.println("------------------------------------");

             // Compare (using compareTo)
             int comparisonResult = string1.compareTo(string2);
             System.out.println("Comparison of String 1 to String 2 (compareTo): " + comparisonResult);
             System.out.println("------------------------------------");

             // Replace spaces with asterisks
             String string1Replaced = string1.replace(' ', '*');
             String string2Replaced = string2.replace(' ', '*');
             System.out.println("String 1 with spaces replaced by asterisks: \"" + string1Replaced + "\"");
             System.out.println("String 2 with spaces replaced by asterisks: \"" + string2Replaced + "\"");

             System.out.println("------------------------------------\n");
             ins.nextLine(); // Consume newline (for consistency with other cases)
             break;

           case 4:
             System.out.println("\nExiting Program...");
             break;

           default:
             System.out.println("\nInvalid Choice!");
             break;
         }
      } while (choice != 4);
    }
  }
}
