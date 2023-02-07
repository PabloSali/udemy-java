package UdemyCodingExercises;

public class CE16 {
    public static boolean isPalindrome(int number) {
        int reverse = 0, lastDigit, originalNumber = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
