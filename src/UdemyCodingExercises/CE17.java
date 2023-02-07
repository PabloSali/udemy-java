package UdemyCodingExercises;

public class CE17 {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        return firstDigit + lastDigit;
    }
}
