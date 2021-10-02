package baseline;

import java.util.Random;

public class MagicBallGenerator {
    //create a constant variable storing the strings and initialize random to be used later
    private final String[] MAGIC_BALL_OUTPUT = {"Yes", "No", "Maybe", "Ask again later."};
    private Random random = new Random(1);

    public String setUserQuestion() {
        //prompts user for question
        return "";
    }

    public int getRandomNumber() {
        //gives random number to be used for indexing output array
        return 0;
    }

    public void askMagicBall() {
        //generates magic ball results
    }
}
