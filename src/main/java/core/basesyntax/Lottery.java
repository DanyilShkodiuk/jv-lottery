package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        String color = ColorSupplier.getRandomColor();
        Ball ball = new Ball(color, randomInt);
        return ball;
    }
}
