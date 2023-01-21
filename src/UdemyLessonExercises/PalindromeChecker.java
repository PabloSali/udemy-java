package UdemyLessonExercises;
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Deed"));
        System.out.println(isPalindrome("palindrome"));
        System.out.println(isPalindrome("tiger"));
        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String word){
        String lowerWord = word.toLowerCase();
        char [] charArray = lowerWord.toCharArray();
        int counter = 0;
        for(int i = 0; i < charArray.length; i ++){
            if(charArray[i] == charArray[charArray.length - (1 + i)]){
                counter++;
            }
        }
        return counter == charArray.length;
    }
}

// reverseArray[i] = argArray[((argArray.length - (1 + i)))];
