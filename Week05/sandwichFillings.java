public class sandwichFillings {  
    public static String sandwichFillings(String input){  
        String bread = "bread";  
        int firstBread = input.indexOf(bread);  
        int lastBread = input.lastIndexOf(bread);  
        if(firstBread == -1 || lastBread == -1 || firstBread == lastBread) {  
            return "none";  
        }  
        return input.substring(firstBread + bread.length(), lastBread);  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(sandwichFillings("breadtunabread")); // "tuna"  
  
        // test case 2
        System.out.println(sandwichFillings("chipsbreadtunasalad")); // "none"  
    }  
}
