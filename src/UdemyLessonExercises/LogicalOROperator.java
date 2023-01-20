package UdemyLessonExercises;

public class LogicalOROperator {
    public static void main(String[] args) {
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("this is not supposed to happen");
        }

        if(!isCar){
            System.out.println("this is the same");
        }

        // Ternary Operator
        //
        String makeOfCar = "Volkswagon";
        boolean isDomestic = makeOfCar == "Volkswagon" ?false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        // Section 4 Challenge

        //1
        double var1 = 20.00;
        //2
        double var2 = 80.00;
        //3
        double var3 = (var1 + var2) * 100.00;
        //4
        double var4 = var3 % 40.00;
        //5
        boolean is0 = (var4 == 0) ?true : false;
        //6
        System.out.println(is0);
        //7
        if(!is0){
            System.out.println("got some remainders");
        }



    }

}
