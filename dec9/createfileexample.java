import java.io.File;
import java.io.IOException;

public class createfileexample {
  public static void main(String[] args) {

    try{
      // Specify File Name
      File file = new File("COM251_DeLuna.txt");

      // Check if the file already Exists
      if (file.exists()) {
        System.out.println("File already exists: " + file.getAbsolutePath());
      } else {
        // Create a new File
        if (file.createNewFile()) {
          System.out.println("File Created Successfully: " + file.getAbsolutePath());
        } else {
          System.out.println("Failed to create the file.");
        }
      }
    } catch (IOException e) {
      System.err.println("An error occured while creating the file: "+ e.getMessage());
    }
  }
}
