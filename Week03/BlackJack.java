import java.util.Scanner;  
public class BlackJack {  
    public static void main(String[] arg){  
        Scanner scanner=new Scanner(System.in);  
        String input=scanner.nextLine();  
        int card1=Integer.parseInt(input);  
        input=scanner.nextLine();  
        int card2=Integer.parseInt(input);  
        if (card1<=21 && card2<=21){  
            System.out.println(Math.max(card1, card2));  
        }  
        else{  
            if (card1<=21 || card2<=21){  
                System.out.println(Math.min(card1, card2));  
            }  
            else{  
                System.out.println(-1);  
            }  
        }  
    }  
}
