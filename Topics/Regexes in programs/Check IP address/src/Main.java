import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //noinspection HardcodedFileSeparator
        String octet = "([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])";

        //noinspection HardcodedFileSeparator
        String ip = '(' + octet + "\\.){3}" + octet;

        System.out.println(scanner.nextLine().matches(ip) ? "YES" : "NO");
    }
}