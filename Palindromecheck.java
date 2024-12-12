import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 12321; 
        boolean isPalindrome = checkPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(int number) {
        Stack<Integer> stack = new Stack<>();
        int originalNumber = number; 

        
        while (number > 0) {
            int digit = number % 10; 
            stack.push(digit); 
            number /= 10; 
        }

      
        int reversedNumber = 0;
        int placeValue = 1;

        while (!stack.isEmpty()) {
            reversedNumber += stack.pop() * placeValue;
            placeValue *= 10;
        }


        return originalNumber == reversedNumber;
    }
}