import java.util.Scanner;
public class HailStone {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int numb=1;
        if (n<=0){
            System.out.println("Error.");
        }
        else{
            while (n != 1){
                if (n%2==0){
                    n=n/2;
                }
                else{
                    n=3*n+1;
                }
                numb++;
            }
            System.out.println(numb);
        }
    }
}
