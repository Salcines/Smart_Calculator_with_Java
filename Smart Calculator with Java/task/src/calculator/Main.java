package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String EXIT_COMMAND = "/exit";
        final String HELP_COMMAND = "/help";

        Scanner scanner = new Scanner(System.in);
        // put your code here
        while (true) {

            String line = scanner.nextLine();
            if (line.equals(EXIT_COMMAND)) {
                break;
            }

            if (line.isEmpty()) {
                continue;
            }

            if (line.equals(HELP_COMMAND)) {
                System.out.println("The program calculates the sum of numbers");
                continue;
            }

            String[] numbers = line.split("\\s+");
            long result = Long.parseLong(numbers[0]);

            for (int i = 1; i < numbers.length; i++) {
                long nextNumber = Long.parseLong(numbers[i]);
                result = add(result, nextNumber);
            }

            System.out.println(result);
        }
        System.out.println("Bye!");
    }

    public static long add(long firstNumber,
                           long secondNumber) {
        return firstNumber + secondNumber;
    }
}
