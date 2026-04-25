import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class isPartitionable {
    public static boolean isPartitionable(List<Integer> list) {
        int totalSum = 0;
        for (int num : list) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        int currentSum = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            currentSum += list.get(i);
            if (currentSum == targetSum) {
                return true;
            }
        }

        return false;
    }
}
