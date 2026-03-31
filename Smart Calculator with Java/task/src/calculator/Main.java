package calculator;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String EXIT_COMMAND = "/exit";

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

            String[] numbers = line.split("\\s+");
            int firstNumber =Integer.parseInt(numbers[0]);
            int secondNumber = numbers.length > 1 ? Integer.parseInt(numbers[1]) : 0;

            add(firstNumber, secondNumber);
        }
        System.out.println("Bye!");
    }

    public static void add(int firstNumber,
                           int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
