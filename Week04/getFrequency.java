public class getFrequency {  
    public static int getFrequency(int[] input, int num) {  
        int fre=0;  
        for ( int i=1; i-1<input.length; i++ ){  
            if (num==input[i-1]){  
                fre++;  
            }  
        }  
        return fre;  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(getFrequency(new int[]{1, 2, 1}, 1)); // 2  
                // test case 2  
        System.out.println(getFrequency(new int[]{1, 2, 1}, 2)); // 1  
    }  
}
