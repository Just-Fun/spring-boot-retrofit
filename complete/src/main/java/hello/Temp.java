package hello;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Serzh on 1/27/17.
 */
public class Temp {
    public static void main(String[] args) {
        String[] array1 = new String[]{"car", "glass", "cat", "pink dress", "early birds"};
        String[] array2 = new String[]{"home", "car", "glass", "cat", "early birds"};
        String[] resultCheck = new String[]{"home", "pink dress"};

        String[] result = compare(array1, array2);
        System.out.println(Arrays.asList(result));
    }

    private static String[] compare(String[] array1, String[] array2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            String key = array1[i];
            map.put(key, getValue(map, key));
        }

        for (int i = 0; i < array2.length; i++) {
            String key = array2[i];
            map.put(key, getValue(map, key));
        }

        Set<String> strings = map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(1))
                .map(entry1 -> String.valueOf(entry1.getKey())).collect(Collectors.toSet());

        return strings.toArray(new String[strings.size()]);
    }

    private static int getValue(Map<String, Integer> map, String key) {
        if (map.get(key) != null) {
            return map.get(key) + 1;
        }
        return 1;
    }
}
