public class calcNetIncome {  
    public static int calcNetIncome(String input){  
        int income=0;  
        int temp=0;  
        int power=0;  
  
        for(int i=input.length()-1; i>=0;i--){  
            if(Character.isDigit(input.charAt(i))){  
                temp=temp+Integer.parseInt(input.substring(i,i+1))*(int)Math.pow(10,power);  
                power++;  
            }  
            else if(input.charAt(i)=='-'){  
                temp=(-1)*temp;  
                income=income+temp;  
                temp=0;  
                power=0;  
            }  
            else{  
                power=0;  
                income=income+temp;  
                temp=0;  
            }  
        }  
        if (temp!=0){  
            income=income+temp;  
        }  
        return income;  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(calcNetIncome("salary 15000yuan bonus2000 rent -1000Y")); // 16000  
  
        // test case 2
        System.out.println(calcNetIncome("25000 gross income, -200 water, electricity:-300")); // 24500  
    }  
}
