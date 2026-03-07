public class PalindromeNumberChecker {

    
    public static boolean isPalindrome(int num) {
        
        int originalNum = num;
        int reverse = 0;
        int lastDigit;

        
        if (num < 0) {
            return false;
        }

        while (num != 0) {
            
            lastDigit = num % 10;
            
            reverse = reverse * 10 + lastDigit;
            
            num /= 10;
        }

        
        return originalNum == reverse;
    }

    public static void main(String[] args) {
        int number1 = 121;
        int number2 = 12345;

        if (isPalindrome(number1)) {
            System.out.println(number1 + " is a palindrome number.");
        } else {
            System.out.println(number1 + " is not a palindrome number.");
        }

        if (isPalindrome(number2)) {
            System.out.println(number2 + " is a palindrome number.");
        } else {
            System.out.println(number2 + " is not a palindrome number.");
        }
    }
}
