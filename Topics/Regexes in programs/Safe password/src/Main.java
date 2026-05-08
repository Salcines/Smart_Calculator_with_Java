import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // One big regex for password validation
        final String fullRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{12,}$";
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String password = scanner.nextLine();
        boolean isSafe = password.matches(fullRegex);

        // Using several separate regexes for validation
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasLength = password.length() >= 12;

        if ((hasLowercase &&
                hasUppercase &&
                hasDigit &&
                hasLength)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}