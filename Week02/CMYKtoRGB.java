import java.util.Scanner;
public class CMYKtoRGB {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Double cyan=Double.parseDouble(input);
        input=scanner.nextLine();
        Double magenta=Double.parseDouble(input);
        input=scanner.nextLine();
        Double yellow=Double.parseDouble(input);
        input=scanner.nextLine();
        Double black=Double.parseDouble(input);
        Double white=1-black;
        Integer red=(int)Math.round(255*white*(1-cyan));
        Integer green=(int)Math.round(255*white*(1-magenta));
        Integer blue=(int)Math.round(255*white*(1-yellow));
        System.out.println("red = "+red);
        System.out.println("green = "+green);
        System.out.println("blue = "+blue);
    }
}
