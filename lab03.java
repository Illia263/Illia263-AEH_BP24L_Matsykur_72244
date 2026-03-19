
// Task 1

// import java.util.Scanner;

// public class lab03 {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter a number greater than 100:");
//     var number1 = scanner.nextDouble();
//     while (number1 <= 100) {
//       System.out.println("The number is not greater than 100, enter again: ");
//       number1 = scanner.nextDouble();

//     }
//     System.out.println("Thank you You've entered:" + number1);
//     double number2;
//     do {
//       System.out.println("Enter a number grater than 200:");
//       number2 = scanner.nextDouble();

//     } while (number2 <= 200);
//     System.out.println("Thank you! You've entered: " + number2);
//     int wynik = 0;
//     for (var i = 1; i <= 10; i++) {
//       wynik = wynik + 1;
//       System.out.println("Itteretion no." + i + "in the for loop, and the result (wynik) = " + wynik);
//     }
//     System.out.println("Enter the value of x: ");
//     var x = scanner.nextDouble();
//     System.out.println("Enter the value of y: ");
//     var y = scanner.nextDouble();

//     if (x > y) {
//       System.out.println("x is greater than y");

//     } else if (x < y) {
//       System.out.println("x is smaller than y");

//     } else {
//       System.out.println("x equals y");
//     }
//     while (true) {
//       System.out.println("Enter -1 to exit the program");
//       var input = scanner.nextDouble();
//       if (input == -1) {
//         System.out.println("Exit...");
//         break;
//       }
//     }
//     scanner.close();
//   }
// }

// TASK 2


// import java.util.Scanner;

// public class lab03 {
//   public static void main(String[] args) {
//   Scanner scanner = new Scanner(System.in);
//   while (true) {
//     System.out.println("Enter the number of days (enter 0 or negative to exit): ");
//             int celsius = scanner.nextInt(); 

//             if (celsius <= 0) {
//                 System.out.println("Program finished.");
//                 break; 
//             }
//             int fahranheits = celsius / 7; 
//             int kelvins = celsius % 7; 
//             System.out.println(celsius + " days is " + fahranheits + " fahranheits and " + kelvins + " days.\n");
//         }

//         scanner.close(); 
//     }
// }



//TASK 3

import java.util.Scanner;

public class lab03 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  while (true) {
    System.out.println("Enter the temperature in celsius (enter 0 or negative to exit): ");
            double celsius = scanner.nextDouble(); 
         
            if (celsius <= 0) {
                System.out.println("Program finished.");
                break; 
            }
            double fahranheits = 1.8 * celsius + 32.0; 
            double kelvins = celsius + 273.16; 
            // System.out.println(" Celsius into fahranheits:  " + fahranheits + "\n" + " Celsious into kelvins:" + kelvins);
            System.out.printf(" Celsius into fahranheits: %.2f\n Celsious into kelvins: %.2f\n", fahranheits, kelvins);
        }
        
        scanner.close(); 
    }
}