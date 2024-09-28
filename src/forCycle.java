import java.util.Scanner;

public class forCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number from 1 to 20: ");
            if(input.hasNextInt()){
                int number = input.nextInt();
                if(number<1 || number>20) {
                    System.out.println("Error!");
                } else {
                    for (int i = 1; i <= number; i++) {
                        for (int j = 1; j <= number; j++) {
                            if(i * j==number) {
                                System.out.println(i + "*" + j + "=" + number);
                            }
                        }
                    }
                    break;
                }
            } else {
                System.out.println("Error!");
            }
        } while (true);
        input.close();
    }
}
