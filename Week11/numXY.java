public class numXY {
    public static int numXY(String input) {
        // base case
        int count=0;
        if(input==null||input.length()<2){
            return 0;
        }
        else{
            if(input.charAt(0)=='X'&&input.charAt(1)=='Y'){
                count=1;
            }
        }
        // recursive step
        return count+numXY(input.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(numXY("AAXYAA")); // 1
        System.out.println(numXY("AXYBXYAA")); // 2
    }
}
