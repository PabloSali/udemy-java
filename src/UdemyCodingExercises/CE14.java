package UdemyCodingExercises;

public class CE14 {
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

    public static int getDaysInMonth(int month, int year){
        int[] month31 = {1, 3, 5, 7, 8, 10, 12};
        int monthCounter = 0;
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        else{
            for(int userMonth: month31){
                if(userMonth == month){
                     monthCounter++;
                }else {
                    break;
                }
            }
            if(monthCounter == 1){
                return 31;
            }else if(month == 2){
                if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            }else{
                return 30;
            }
        }
    }
}
