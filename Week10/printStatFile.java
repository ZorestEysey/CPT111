import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class printStatFile {
    public static void printStatFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner input = new Scanner(file);
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            while (input.hasNextLine()) {
                String line = input.nextLine();
                lineCount++;
                String[] words = line.split(" ");
                wordCount += words.length;
                for (String word : words) {
                    charCount += word.length();
                }
            }

            System.out.println(lineCount);
            System.out.println(wordCount);
            System.out.println(charCount);

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
