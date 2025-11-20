import java.util.Scanner;

public class NestedLoop {
  public static void main(String[] args) {

  //Global Variables
  Scanner ins = new Scanner(System.in);
  int num;
  int choice;

  //Welcome Prompt
  System.out.print("********************\n");
  System.out.print("* Pick your loops! *\n");
  System.out.print("********************");

  //Menu Output
  System.out.print("\n**************\n*1.Ascending *\n*2.Descending*\n*3.Combined  *\n**************\n");
  choice = ins.nextInt();

  //Switch Keys
  switch (choice) {
    case 1:
      System.out.print("Ascending...\nEnter a Number: ");
      num = ins.nextInt();
      for (int i = 0; i <= num; i++) {
        for (int j = 0; j <= i; j++) {
         System.out.print("*");
        }
       System.out.println();
      }
    break;

    case 2:
      System.out.print("Descending...\nEnter a Number: ");
      num = ins.nextInt();
      for (int i = 1; i >= num; i--) {
        for (int j = 1; j <= i; j++) {
         System.out.print("*");
        }
       System.out.println();
      }
    break;

    case 3:
      System.out.print("Combined...\nEnter a Number: ");
      num = ins.nextInt();
      for (int i = 0; i <= num; i++) {
        for (int j = 0; j <= i; j++) {
         System.out.print("*"); 
        }
       System.out.println();
      }
      for (int i = num; i >= 0 ; i--) {
        for (int j = 1; j <= i; j++) {
         System.out.print("*");
        }
       System.out.println();
      }
    break;

    default:
      System.out.print("Invalid Choice. Pick a number from (1-3)!!!");
  }

  }
}
