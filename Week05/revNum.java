public class revNum {  
    public static String revNum(String input){  
        int digit=0;  
        for(int i =0;i<input.length();i++){  
            if(Character.isDigit(input.charAt(i))){  
                digit++;  
            }  
        }  
        int[] location=new int[digit];  
        int[] numb=new int[digit];  
        int digitcount=0;  
        for(int i =0;i<input.length();i++){  
            if(Character.isDigit(input.charAt(i))){  
                location[digitcount]=i;  
                numb[digitcount]=Character.getNumericValue(input.charAt(i));  
                digitcount++;  
            }  
        }  
        int arraycount=0;  
        String result="";  
        for (int i=0;i<input.length();i++){  
            if(arraycount<digit&&i==location[arraycount]){  
                result=result+numb[digit-arraycount-1];  
                arraycount++;  
            }  
            else{  
                result=result+input.charAt(i);  
            }  
        }  
        return result;  
    }  
    public static void main(String[] args){  
        // test case  
        System.out.println(revNum("x123_#_4567 yz")); // "x765_#_4321 yz"  
    }  
}
