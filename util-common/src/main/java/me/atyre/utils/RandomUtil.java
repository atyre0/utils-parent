package me.atyre.utils;

import java.util.List;
import java.util.Random;

public class RandomUtil {
    public static Object getRandomObjectFromList(List<Object> list) {
        Random random = new Random();
        Object randomObject = list.get(random.nextInt(list.size()));
        return randomObject;
    }

    public static <T extends Enum<?>> T getRandomEnum(Class<T> clazz) {
        Random random = new Random();
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
