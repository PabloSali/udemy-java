package UdemyLessonExercises;

import java.util.Arrays;

public class IntToIntArrayChallenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intToArray(14532)));
    }
    public static int[] intToArray(int num) {
        String numToStr = Integer.toString(num);
        int[] intArray = new int[numToStr.length()];
        for (int i = 0; i < numToStr.length(); i++) {
            intArray[i] = Character.getNumericValue(numToStr.charAt(i));
        }
        return intArray;
    }
}
