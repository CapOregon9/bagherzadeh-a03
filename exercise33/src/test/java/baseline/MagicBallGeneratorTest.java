package baseline;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallGeneratorTest {

    @Test
    void getRandomNumber() {
        //only works if random is the same seed as random in MagicBallGenerator class
        Random random = new Random(1);
        MagicBallGenerator magicBallGenerator = new MagicBallGenerator();

        int expectedValue = random.nextInt(4);
        int actualValue = magicBallGenerator.getRandomNumber();

        assertEquals(expectedValue, actualValue);
    }
}