public class Circle {
    private double centerX;
    private double centerY;
    private double radius;
    public Circle(){
        this.centerX=0;
        this.centerY=0;
        this.radius=1;
    }
    public Circle(double x, double y, double r){
        this.centerX=x;
        this.centerY=y;
        if (r>0){
            this.radius=r;
        }
        else{
            this.radius=1;
        }
    }
    public void setCenter(double newX, double newY){
        this.centerX=newX;
        this.centerY=newY;
    }
    public void setRadius(double newRadius){
        if(newRadius>0){
            this.radius=newRadius;
        }
    }
    public double getCenterX(){
        return this.centerX;
    }
    public double getCenterY(){
        return this.centerY;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    public String toString(){
        return "Circle(center=("+Double.toString(this.centerX)+", "+Double.toString(this.centerY)+"), radius="+Double.toString(this.radius)+")";
    }
    public static void main (String[] args){
        // test case 1
        Circle c1 = new Circle();
        System.out.println(c1);                     // Circle(center=(0.0, 0.0), radius=1.0)
        System.out.println(c1.getArea());           // 3.141592653589793
        System.out.println(c1.getCircumference());  // 6.283185307179586

        // test case 2
        Circle c2 = new Circle(2.0, -1.5, 3.0);
        System.out.println(c2);                     // Circle(center=(2.0, -1.5), radius=3.0)
        c2.setRadius(5.0);
        System.out.println(c2.getRadius());         // 5.0
        System.out.println(c2.getArea());           // 78.53981633974483

        // test case 3
        Circle c3 = new Circle(0.0, 0.0, -10.0);
        System.out.println(c3.getRadius());         // 1.0
        c3.setRadius(-2.0);
        System.out.println(c3.getRadius());         // 1.0
    }
}
