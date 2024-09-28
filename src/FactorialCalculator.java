import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the number whose factorial you want to find: ");
            if(input.hasNextInt()) {
                int inputNumber = input.nextInt();
                int factorial = 1;
                for (int i = 1; i <= inputNumber; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + inputNumber + " = " + factorial);
                break;
            } else {
                System.out.println("Error! You must enter an integer");
                input.next();
            }
        } while (true);
        input.close();
    }
}