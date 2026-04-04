import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        if (!input.hasNextLine()) {
            return;
        }
        String html = input.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < html.length(); i++) {
            if (html.charAt(i) == '<') {
                if (i + 1 < html.length() && html.charAt(i + 1) == '/') {
                    if (!stack.isEmpty()) {
                        int openingTagStart = stack.pop();
                        int openingTagEnd =
                                html.indexOf('>',
                                        openingTagStart);
                        if (openingTagEnd != -1 && openingTagEnd < i) {
                            System.out.println(html.substring(openingTagEnd + 1, i));
                        }
                    }
                } else {
                        stack.push(i);
                    }
            }
        }
    }
}