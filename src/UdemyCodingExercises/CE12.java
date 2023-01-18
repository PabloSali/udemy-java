package UdemyCodingExercises;

public class CE12 {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            return (temperature <= 45 && temperature >= 25);
        }else{
            return (temperature <= 35 && temperature >= 25);
        }
    }
}
