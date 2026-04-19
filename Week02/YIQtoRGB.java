import java.util.Scanner;
public class YIQtoRGB {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Double Y=Double.parseDouble(input);
        input=scanner.nextLine();
        Double I=Double.parseDouble(input);
        input=scanner.nextLine();
        Double Q=Double.parseDouble(input);
        int R=(int)Math.round(255*(Y+0.956*I+0.619*Q));
        int G=(int)Math.round(255*(Y-0.272*I-0.647*Q));
        int B=(int)Math.round(255*(Y-1.106*I+1.703*Q));
        R = Math.min(255, Math.max(0, R));
        G = Math.min(255, Math.max(0, G));
        B = Math.min(255, Math.max(0, B));
        System.out.println("red = "+R);
        System.out.println("green = "+G);
        System.out.println("blue = "+B);
    }
}
