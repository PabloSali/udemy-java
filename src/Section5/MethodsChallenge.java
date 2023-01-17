package Section5;

public class MethodsChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", 1500);
        displayHighScorePosition("Jim", 1000);
        displayHighScorePosition("Gim", 500);
        displayHighScorePosition("Lim", 100);
        displayHighScorePosition("Rim", 25);

    }
    public static void displayHighScorePosition(String playerName, int playerScorePosition){
        System.out.println(playerName + " came in " + calculateHighScorePosition(playerScorePosition) + " on the high score list.");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500){
            return 2;
        } else if(playerScore >= 100){
            return 3;
        } else{
            return 4;
        }
    }
}
