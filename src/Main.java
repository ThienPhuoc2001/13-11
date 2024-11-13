public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompledted = 5;
        int bonus = 100;
        int finalScore = score;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompledted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
         gameOver = true;
         score = 800;
        levelCompledted = 5;
        bonus = 100;
        finalScore = score;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompledted * bonus);
            System.out.println("Your final score is " + finalScore);
        }


    }
}