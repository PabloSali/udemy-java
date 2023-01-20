package UdemyLessonExercises;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(testArray)));
    }
    public static int[] reverse(int[] argArray){
        int[] reverseArray = new int[argArray.length];
        for(int i = 0; i < argArray.length; i++){
            reverseArray[i] = argArray[((argArray.length - (1 + i)))];
        }
        return reverseArray;
    }
}
