import java.util.Scanner;
public class Armstrong {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int a=Integer.parseInt(input);
        input=scanner.nextLine();
        int k=Integer.parseInt(input);
        int numb=0;
        while (numb<k){
            int digit=1;
            while (a>=(int)Math.pow(10,digit)){
                digit++;
            }
            int n=1;
            int ele;
            int Armstrong=0;
            int a_fake=a;
            while (n<=digit){
                ele = a_fake % 10;
                a_fake /= 10;
                Armstrong=Armstrong+(int)Math.pow(ele,digit);
                n++;
            }
            if (Armstrong==a){
                numb++;
                System.out.println(a);
            }
            a++;
        }
    }
}
