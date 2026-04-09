import java.util.Scanner;

class Main {
    private static final String PASSWORD_KEY = "pass";
    private static final String WITHOUT_VALUE = "not found";
    private static final String KEY_SEPARATOR = " : ";
    private static final String PARAMETER_SEPARATOR = "&";
    private static final String VALUES_SEPARATOR = "=";
    private static final char PARAMETER_LIST = '?';
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();
        input.close();
        String returnLine = System.lineSeparator();

        String query =
                url.substring(url.indexOf(PARAMETER_LIST) + 1);

        String[] params = query.split(PARAMETER_SEPARATOR);

        StringBuilder output = new StringBuilder();
        String passwordValue = null;

        for (String param : params) {
            String[] keyValue = param.split(VALUES_SEPARATOR, -1);
            String key = keyValue[0];
            String value = keyValue[1].isEmpty() ?
                    WITHOUT_VALUE : keyValue[1];

            output.append(key)
                    .append(KEY_SEPARATOR)
                    .append(value)
                    .append(returnLine);

            if (PASSWORD_KEY.equals(key) && !keyValue[1].isEmpty()) {
                passwordValue = keyValue[1];
            }
        }
        if (passwordValue != null) {
            output.append("password : ").append(passwordValue).append(returnLine);
        }

        System.out.println(output.toString().trim());
    }
}