public class isValidID {  
    public static boolean isValidID(String input){  
        boolean valid=true;  
        int count=0;  
        if (input.length()<5){  
            valid=false;  
        }  
        for (int i=0;i<input.length();i++){  
            if (!Character.isLetter(input.charAt(i))&&input.charAt(i)!='-'&&!Character.isDigit(input.charAt(i))){  
                valid=false;  
            }  
            else if(Character.isDigit(input.charAt(i))&&i!=input.length()-1){  
                count += Character.getNumericValue(input.charAt(i));  
            }  
        }  
        int rem=count%11;  
        if(rem!=10){  
            if (input.charAt(input.length()-1) != (char)('0' + rem)) {  
                valid = false;  
            }  
        }  
        else{  
            if(input.charAt(input.length()-1)!='X'){  
                valid=false;  
            }  
        }  
        return valid;  
    }  
    public static void main(String[] args){  
        // text case 1  
        System.out.println(isValidID("THMBB7092WD114221")); // false  
  
        // text case 2
        System.out.println(isValidID("A001-606X-17X")); // true  
    }  
}
