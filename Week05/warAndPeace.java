public class warAndPeace {  
    public static boolean warAndPeace(String test) {  
        String war="war";  
        String peace="peace";  
        int i;  
        int j;  
        int countWar=0;  
        int countPeace=0;  
        for (i=0;i<test.length()-war.length()+1;i++){  
            if (test.substring(i,i+war.length()).equals(war)){  
                countWar++;  
            }  
        }  
        for (j=0;j<test.length()-peace.length()+1;j++){  
            if (test.substring(j,j+peace.length()).equals(peace)){  
                countPeace++;  
            }  
        }  
        if (countWar==countPeace){  
            return true;  
        }  
        else{  
            return false;  
        }  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(warAndPeace("there was never a good war, or a bad peace")); // true  
  
        // test case 2
        System.out.println(warAndPeace("war what is it good for")); // false  
    }  
}
