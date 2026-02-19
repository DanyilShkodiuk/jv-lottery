package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Random random = new Random();
        Colors[] value = Colors.values();
        int index = random.nextInt(value.length);
        return value[index].name();
    }
}
