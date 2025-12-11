public class array2d {
  public static void main(String[] args) {

    //Initialize Variables
    int[] predefarray1 = {1,3,5,7,9,11,13,15,17,19};
    int[] predefarray2 = {2,4,6,8,10,12,14,16,18,20};
    int[] sum = new int[10];
    //Adding Outputs
    for (int i = 0; i < 10; i++) {
      sum[i] = predefarray1[i] + predefarray2[i];
      System.out.println("The Sum of " + predefarray1[i] + " & " + predefarray2[i] + " is Equals to: " + sum[i]);
    }
  }
}
