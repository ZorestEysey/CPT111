import java.util.Scanner;  
public class PandemicSpread {  
    public static void main(String[] arg) {  
        Scanner scanner = new Scanner(System.in);  
        String input = scanner.nextLine();  
        int init = Integer.parseInt(input);  
        input = scanner.nextLine();  
        int numInfect = Integer.parseInt(input);  
        input = scanner.nextLine();  
        int population = Integer.parseInt(input);  
        int day = 1;  
        int infected = init;  
        while (infected < population) {  
            infected = infected * (numInfect+1);  
            day++;  
        }  
        System.out.println(day);  
    }  
}
