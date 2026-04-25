import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class sameFirstLetter {
    public static String sameFirstLetter(List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String word : list) {
            if (word == null || word.isEmpty()) continue;
            String firstLetter = word.substring(0, 1);
            if (!map.containsKey(firstLetter)) {
                map.put(firstLetter, word);
            } else {
                String existing = map.get(firstLetter);
                map.put(firstLetter, existing + "," + word);
            }
        }
        StringBuilder json = new StringBuilder("{");
        int count = 0;
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (count++ > 0) json.append(", ");
            json.append('"').append(e.getKey()).append('"')
                    .append(": ")
                    .append('"').append(e.getValue()).append('"');
        }
        json.append("}");
        return json.toString();
    }
    public static void main(String[] args){
        System.out.println(sameFirstLetter(Arrays.asList("alice", "bob", "apple", "banana"))); // {"a": "alice,apple", "b": "bob,banana"}
        System.out.println(sameFirstLetter(Arrays.asList("after", "all", "this", "time", "always"))); // {"a": "after,all,always", "t": "this,time"}
    }
}
