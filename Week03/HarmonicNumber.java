import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input;
        input=scanner.nextLine();
        int n;
        n=Integer.parseInt(input);
        double i=1.0;
        double n1=0;
        if (n>=1){
            while (i<=n){
                n1+=(double)1.0/i;
                i++;
            }
            System.out.println(n1);
        }
    }
}
