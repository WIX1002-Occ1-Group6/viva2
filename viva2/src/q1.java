import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // Create Scanner object
      System.out.println("Enter number :");  
      //Prompt user to enter a number
      long number = scanner.nextLong();
      //Use long type to receive input(avoid overflow for large numbers)
      int digitalRoot; //Define digital root variable
      if (number == 0) {
        digitalRoot = 0;
        
      } else if (number % 9 ==0) {
        digitalRoot = 9;
      } else{
        digitalRoot = (int) (number % 9);
    }
    System.out.println("Digital root:"+ digitalRoot);
    // Print digital root
    scanner.close();
}
}
