public class sepStar {
    public static String sepStar(String input){
        // base case
        if(input.length()<2){
            return input;
        }
        // recursive step
        if(input.charAt(0)!=input.charAt(1)){
            return input.substring(0,1)+sepStar(input.substring(1));
        }
        else{
            return input.substring(0,1)+"*"+sepStar(input.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(sepStar("hello")); // "hel*lo"
        System.out.println(sepStar("uuvxxyzzz")); // "u*uvx*xyz*z*z"
    }
}
