package UdemyCodingExercises;

public class CE5 {
    public static boolean isLeapYear(int year){
         if(year >= 1 && year <= 9999){
             if(year % 4 == 0){
                 if (year % 100 == 0 && !(year % 400 == 0)){
                     return false;
                 }else{
                     return true;
                 }
             }else{
                 return false;
             }
         }else{
             return false;
         }
    }
}
