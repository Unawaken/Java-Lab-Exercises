import java.util.Scanner;

public class LabActivity1 {
    public static void main(String[] args) {

        Scanner ins = new Scanner(System.in);
        int num;
        int choice;

        // 1. Predefined Arrays (For Case 5 Only)
        int[] givenArray1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] givenArray2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        // 2. Empty Arrays with Index 10 (For Case 6 & 7 Input)
        int[] inputArray1 = new int[10];
        int[] inputArray2 = new int[10];
        int[] sum = new int[10];

        // Welcome Prompt
        System.out.print("********************\n");
        System.out.print("* Lab Activity 1   *\n* November 21, 2025*\n* Programmed by: Emman Christopher R. De Luna *\n");
        System.out.print("********************");

        // Continuous Menu Loop
        do {
            System.out.print("\n*******************\n* 1. Asterisk    *\n* 2. Triangle    *\n* 3. Reversed    *\n* 4. Combined    *\n* 5. Sum (Given) *\n* 6. Sum (Input) *\n* 7. Operations  *\n* 0. Exit        *\n*******************\nEnter choice: ");
            choice = ins.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Asterisk...\nEnter a Number: ");
                    num = ins.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Triangle...\nEnter a Number: ");
                    num = ins.nextInt();
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Reversed...\nEnter a Number: ");
                    num = ins.nextInt();
                    for (int i = num; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.print("Combined...\nEnter a Number: ");
                    num = ins.nextInt();
                    // Top Half
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    // Bottom Half
                    for (int i = num - 1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("Sum of Array (Given)...\n");
                    for (int i = 0; i < 10; i++) {
                        sum[i] = givenArray1[i] + givenArray2[i];
                        System.out.println("The Sum of " + givenArray1[i] + " & " + givenArray2[i] + " is Equals to: " + sum[i]);
                    }
                    break;

                case 6:
                    System.out.println("Sum of Array (Input)...");
                    
                    // PHASE 1: INPUT
                    System.out.println("--- Enter Values ---");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Index " + i + " | Enter Value A: ");
                        inputArray1[i] = ins.nextInt();
                        System.out.print("Index " + i + " | Enter Value B: ");
                        inputArray2[i] = ins.nextInt();
                    }

                    // PHASE 2: OUTPUT
                    System.out.println("\n--- Results ---");
                    for (int i = 0; i < 10; i++) {
                        sum[i] = inputArray1[i] + inputArray2[i];
                        System.out.println("Index " + i + ": " + inputArray1[i] + " + " + inputArray2[i] + " = " + sum[i]);
                    }
                    break;

                case 7:
                    System.out.println("Array Operators (Input)...");
                    
                    // PHASE 1: INPUT
                    System.out.println("--- Enter Values ---");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Index " + i + " | Enter Value A: ");
                        inputArray1[i] = ins.nextInt();
                        System.out.print("Index " + i + " | Enter Value B: ");
                        inputArray2[i] = ins.nextInt();
                    }

                    // PHASE 2: OUTPUT
                    System.out.println("\n--- Detailed Results ---");
                    for (int i = 0; i < 10; i++) {
                        int val1 = inputArray1[i];
                        int val2 = inputArray2[i];
                        
                        System.out.print("Index " + i + " (" + val1 + " & " + val2 + ") => ");
                        System.out.print("Sum: " + (val1 + val2) + " | ");
                        System.out.print("Diff: " + (val1 - val2) + " | ");
                        System.out.print("Prod: " + (val1 * val2) + " | ");
                        
                        if (val2 != 0) {
                            System.out.print("Quot: " + (val1 / val2) + " | ");
                            System.out.println("Mod: " + (val1 % val2));
                        } else {
                            System.out.print("Quot: Undef | ");
                            System.out.println("Mod: Undef");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);

        ins.close();
    }
}
