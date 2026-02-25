import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue.remove();
            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
        scanner.close();
    }
}