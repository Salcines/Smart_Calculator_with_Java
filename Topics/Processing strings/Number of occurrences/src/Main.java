import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String wholeText = input.nextLine();
        String searchText = input.nextLine();

        int count = 0;
        int index = wholeText.indexOf(searchText);
        while (index != -1) {
            count++;
            index = wholeText.indexOf(searchText, index + searchText.length());
        }

        System.out.println("Number of occurrences: " + count);
    }
}