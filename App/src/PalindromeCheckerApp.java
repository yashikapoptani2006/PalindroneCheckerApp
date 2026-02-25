import java.util.*;

public class PalindromeCheckerApp {

    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoPointerPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC13: Performance Comparison =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(input);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Stack Strategy Result: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Strategy Result: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Strategy Result: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        scanner.close();
    }
}