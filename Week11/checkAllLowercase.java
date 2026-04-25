public class checkAllLowercase {
    public static boolean checkAllLowercase(String input) {

        /// base case
        if (input.isEmpty()) {
            return true;
        }

        if (!Character.isLowerCase(input.charAt(0))) {
            return false;
        }

        // recursive step
        return checkAllLowercase(input.substring(1));
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        System.out.println(checkAllLowercase(str1)); // true
        String str2 = "xYz";
        System.out.println(checkAllLowercase(str2)); // false
    }
}
