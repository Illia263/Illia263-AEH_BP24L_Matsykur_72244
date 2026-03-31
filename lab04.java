import java.util.Scanner;

public class lab04 {

    //TASK 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    //     System.out.print("Enter lower and upper integer limits: ");
    //     int lower = scanner.nextInt();
    //     int upper = scanner.nextInt();
        
    //     while (upper > lower) {
    //         int sum = 0;
    //         for (int i = lower; i <= upper; i++) {
    //             sum += i * i;
    //         }
    //         System.out.println("The sums of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + sum);
            
    //         System.out.print("Enter next set of limits: ");
    //         lower = scanner.nextInt();
    //         upper = scanner.nextInt();
    //     }
        
    //     System.out.println("Done");
    //     scanner.close();
    // }



    // TASK 2

    while (true) {
            System.out.println("Menu: +, -, *, /");
            System.out.print("Select operation (or type q to quit): ");
            String op = scanner.next();

            if (op.equals("q")) {
                break;
            }

            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                
                System.out.print("Enter first number: ");
                while (scanner.hasNextDouble() == false) {
                    System.out.print("That is not a number! Try again: ");
                    scanner.next();
                }
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                while (scanner.hasNextDouble() == false) {
                    System.out.print("That is not a number! Try again: ");
                    scanner.next(); 
                }
                double num2 = scanner.nextDouble();

                if (op.equals("+")) {
                    System.out.println("Result: " + (num1 + num2));
                } else if (op.equals("-")) {
                    System.out.println("Result: " + (num1 - num2));
                } else if (op.equals("*")) {
                    System.out.println("Result: " + (num1 * num2));
                } else if (op.equals("/")) {
                    System.out.println("Result: " + (num1 / num2));
                }
                
            } else {
                System.out.println("Wrong operation. Try again.");
            }
        // scanner.close();
    }
}}