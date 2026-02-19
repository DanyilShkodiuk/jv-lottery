package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        Colors[] value = Colors.values();
        int index = random.nextInt(value.length);
        return value[index].toString();
    }
}
