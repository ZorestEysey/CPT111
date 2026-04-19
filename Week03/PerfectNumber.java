import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int ele=1;
        int sum=0;
        if (n>0){
            while (ele<=(n/2)){
                if (n%ele==0){
                    sum=sum+ele;
                }
                ele++;
            }
            if (sum==n){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("Error.");
        }
    }
}
