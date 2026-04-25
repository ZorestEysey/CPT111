import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class intersectList {
    public static List<String> intersectList(List<String> list1, List<String> list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String word : list1) {
            if (!map.containsKey(word))
                map.put(word, 1);
            else
                map.put(word, map.get(word) + 1);
        }

        for (String word : list2) {
            if (map.containsKey(word) && map.get(word) > 0) {
                result.add(word);
                map.put(word, map.get(word) - 1);
            }
        }

        return result;
    }
}
