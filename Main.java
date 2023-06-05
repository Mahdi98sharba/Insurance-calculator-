// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int age ;
        int year_model;


        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input and setting values
        System.out.print("Enter your age : ");
        age = scanner.nextInt();
        System.out.print("Enter your Car's Year Model : ");
        year_model = scanner.nextInt();




            if (age >= 25  ){

                indicator = true;
                if (year_model >= 2013){
                    System.out.print("Your car insurance Monthly Rate is $250");
                    System.exit(0);
                }
                    System.out.print("Your car insurance Monthly Rate is $150");
                System.exit(0);


            }
             if (age <= 24){


            if (year_model >= 2013){
                System.out.print("Your car insurance Monthly Rate is $350");
                System.exit(0);
            }

            System.out.print("Your car insurance Monthly Rate is $250");

        }


        // Close the scanner
        scanner.close();




        }
    }
