import java.util.Scanner;
public class PolarCoordinates {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Double x=Double.parseDouble(input);
        input=scanner.nextLine();
        Double y=Double.parseDouble(input);
        Double r=Math.sqrt(x*x+y*y);
        Double theta=Math.atan2(y,x);
        System.out.println("r = "+r);
        System.out.println("theta = "+theta);
    }
}
