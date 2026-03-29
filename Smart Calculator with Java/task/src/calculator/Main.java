package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        add(firstNumber, secondNumber);
    }
    public static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
