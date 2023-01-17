package UdemyCodingExercises;

public class CE2 {
    public static void toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println(-1);
        }else{
            System.out.println(Math.round(kilometersPerHour *  0.62137));
        }
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour * 0.62137) + " mi/h");
        }
    }
}
