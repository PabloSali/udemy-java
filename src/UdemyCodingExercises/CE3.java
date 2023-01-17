package UdemyCodingExercises;

public class CE3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kilobyte){
        if(kilobyte < 0){
            System.out.println("Invalid Value");
        }else {
            int megabyte = kilobyte / 1024;
            int kbRemaining = kilobyte - (megabyte * 1024);
            System.out.println(kilobyte + " KB = " + megabyte + " MB and " + kbRemaining + " KB");
        }
    }
}
