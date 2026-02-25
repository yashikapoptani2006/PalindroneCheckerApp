import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = cleaned.length() - 1;
        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== UC10: Case-Insensitive & Space-Ignored Palindrome =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
        scanner.close();
    }
}