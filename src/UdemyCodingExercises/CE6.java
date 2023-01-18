package UdemyCodingExercises;

public class CE6 {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if((num1 >= 0 && num2 >= 0) || (num1 <= 0 && num2 <= 0)){
            if (num1 <= 0 && num2 <= 0) {
                double number1 = Math.ceil(num1 * 1000);
                double number2 = Math.ceil(num2 * 1000);
                return (number1 == number2);
            }else {
                double number1 = Math.floor(num1 * 1000);
                double number2 = Math.floor(num2 * 1000);
                return (number1 == number2);
            }
        }else{
            return false;
        }
    }
}
