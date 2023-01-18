package UdemyCodingExercises;

public class CE4 {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else return barking && (hourOfDay > 22 || hourOfDay < 8);
    }
}
