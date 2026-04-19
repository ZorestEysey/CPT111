import java.util.Scanner;
public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double x1=Double.parseDouble(input);
        input=scanner.nextLine();
        double y1=Double.parseDouble(input);
        input=scanner.nextLine();
        double x2=Double.parseDouble(input);
        input=scanner.nextLine();
        double y2=Double.parseDouble(input);
        double r=6371.0;
        double theta1=Math.toRadians((x2-x1)/2);
        double theta2=Math.toRadians(x1);
        double theta3=Math.toRadians(x2);
        double theta4=Math.toRadians((y2-y1)/2);
        double disk=2*r*Math.asin(Math.sqrt(Math.pow(Math.sin(theta1),2)+Math.cos(theta2)*Math.cos(theta3)*Math.pow(Math.sin(theta4),2)));
        System.out.println(disk+" kilometres");
    }
}
