public class remDup {
    public static String remDup(String input) {
        // base case
        if(input.length()<2){
            return input;
        }
        // recursive step
        if(input.charAt(0)!=input.charAt(1)){
            return input.substring(0,1)+remDup(input.substring(1));
        }
        else{
            return remDup(input.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(remDup("hello")); // "helo"
        System.out.println(remDup("abbbcd")); // "abcd"
    }
}
