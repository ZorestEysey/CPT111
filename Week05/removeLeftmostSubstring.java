public class removeLeftmostSubstring {  
    public static String removeLeftmostSubstring(String input, String target) {  
        String result=input;  
        while(result.contains(target)){  
            result=result.substring(0,result.indexOf(target))+result.substring(result.indexOf(target)+target.length(),result.length());  
        }  
        return result;  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(removeLeftmostSubstring("abcd", "abc")); // d  
  
        // test case 2
		System.out.println(removeLeftmostSubstring("ababccd", "abc")); // d  
    }  
}
