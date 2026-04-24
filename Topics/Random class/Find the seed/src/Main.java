import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();
        int numberQuantity = scanner.nextInt();
        int bounds = scanner.nextInt();

        //Using basic for loop
        /* int bestSeed = 0;
        int minOfMaxValues = Integer.MAX_VALUE;

        for (int i = rangeStart; i <= rangeEnd; i++) {
            int currentMax = Integer.MIN_VALUE;
            Random random = new Random(i);
            for (int j = 0; j < numberQuantity; j++) {
                int randomValue = random.nextInt(bounds);
                currentMax = Math.max(currentMax, randomValue);
            }

            if (Math.min(currentMax, minOfMaxValues) == currentMax) {
                minOfMaxValues = currentMax;
                bestSeed = i;
            }
        }

        System.out.println(bestSeed);
        System.out.println(minOfMaxValues);
        */

        //Using streams as declarative approach
        IntStream.range(rangeStart, rangeEnd)
                .mapToObj(i -> {
                    int currentMax =
                            (bounds > 0 && numberQuantity > 0) ?
                            new Random(i).ints(
                                    numberQuantity, 0, bounds)
                                    .max()
                                    .orElse(0)
                            :0;
                    return new int[]{i, currentMax};
                })
                .min(Comparator.comparing(array -> array[1]))
                .ifPresent(result -> {
                    System.out.println(result[0]);
                    System.out.println(result[1]);
                });

    }
}