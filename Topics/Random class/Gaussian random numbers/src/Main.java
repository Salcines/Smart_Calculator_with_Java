import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int lowerLimit = scanner.nextInt();
        int numberQuantity = scanner.nextInt();
        String input = scanner.next();
        float upperLimit = Float.parseFloat(input.replace(',', '.'));

        long result =
                findGaussianRandomNumbers(lowerLimit,
                        numberQuantity, upperLimit);
        System.out.println(result);
    }

    private static long findGaussianRandomNumbers(int lowerLimit, int numberQuantity, float upperLimit) {
        long GauusianSeed = lowerLimit;

        while (true) {
            Random random = new Random(GauusianSeed);
            boolean isValid = true;

            for (int i = 0; i < numberQuantity; i++) {
                double value = random.nextGaussian();

                if (value > upperLimit) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                return GauusianSeed;
            }
            GauusianSeed++;
        }
    }
}