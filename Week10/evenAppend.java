import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class evenAppend {
    public static String evenAppend(List<String> list) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String str : list) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);
            if (count % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();
    }
}
