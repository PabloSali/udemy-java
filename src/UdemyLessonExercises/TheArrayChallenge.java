package UdemyLessonExercises;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TheArrayChallenge {

    public static int[] getRandomArray(int length){
        Random random = new Random();
        int[] newInt = new int[length];
        for(int i = 0; i < length; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);

        System.out.println(Arrays.toString(sortAndReverse(unsortedArray)));
    }

    private static int[] sortAndReverse(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag  = true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
