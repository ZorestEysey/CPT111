import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class maxStretch {
    public static int maxStretch(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int maxStretch = 1;
        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i);


            int lastIndex = i;
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j) == currentNum) {
                    lastIndex = j;
                    break;
                }
            }

            int stretch = lastIndex - i + 1;

            if (stretch > maxStretch) {
                maxStretch = stretch;
            }
        }

        return maxStretch;
    }
}
