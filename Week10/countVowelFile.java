import java.io.*;
import java.util.*;
public class countVowelFile {
    public static int countVowelFile(String fileName) {

        File file = new File(fileName);
        int numVowels = 0;
        String vowels = "aeiouAEIOU";

        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();

                for (char c : line.toCharArray()) {
                    if (vowels.indexOf(c) != -1) {
                        numVowels++;
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return numVowels;
    }
    public static void main(String[] args) {
        System.out.println(countVowelFile("TestFile1.txt")); // 4
    }
}
