import java.util.Scanner;

public class lab02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //  TASK 1.1
    // System.out.println("Please enter your name:");
    // String forename = scanner.nextLine();
    // System.out.println("Enter your surname: ");
    // String surname = scanner.nextLine();
    // scanner.close();
    // System.out.println("Welcome " + forename + " " + surname);
    
    
    // TASK 1.2
    // double x = 10;
    // double y = 2;
    // var result = x + y;
    // System.out.println("x + y = " + result);
    // result = x - y;
    // System.out.println("x - y = " + result);
    // result = x * y;
    // System.out.println("x * y = " + result);
    // result = x / y;
    // System.out.println("x / y = " + result);
    // result = x % y;
    // System.out.println("x % y = " + result);
    // System.out.println("Enter two numbers separeted by the Enter key: ");
    // double first = scanner.nextDouble();
    // double second = scanner.nextDouble();

    // System.out.println("x + y = " + (first + second));


    //TASK 2.1
    // int x = 10;
    // int doubleX = 10 * 2;
    // int squaredX = 10 * 10;
    // System.out.println("x = " + x);
    // System.out.println("doubleX = " + doubleX);
    // System.out.println("squaredX = " + squaredX);




    //TASK 2.2
    System.out.println("Input your age in years: ");
    int age_in_years = scanner.nextInt();
    scanner.close();
    
    int seconds = 31536000;
    System.out.println("Your age in seconds is: " + (age_in_years * seconds));
    
    

  }
}



