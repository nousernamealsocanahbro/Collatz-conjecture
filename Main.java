import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int steps = 0;

            System.out.println("Enter a number");
            long number = scanner.nextLong();

            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = number * 3 + 1;
                }
                
                steps += 1;
                System.out.println(number);
            }
            System.out.printf("Steps taken: %d\n", steps);
            
            System.out.println("Continue? (y/n)");
            if (scanner.next().equals("n")) {
                System.exit(0);
            }
        }
    }
}