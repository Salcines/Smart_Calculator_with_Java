import java.util.*;

class Date {
    @SuppressWarnings("all")

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        String dateRegex =
                "^(((19\\d{2}|20\\d{2})([-./])" +
                        "(0[1-9]|1[0-2])\\4" +
                        "(0[1-9]|[12]\\d|3[01]))|(" +
                        "(0[1-9]|[12]\\d|3[01])([-./])" +
                        "(0[1-9]|1[0-2])\\9" +
                        "(19\\d{2}|20\\d{2})))$";


        if (date.matches(dateRegex)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}