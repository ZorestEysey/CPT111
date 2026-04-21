public class LabeledCircle extends Circle{
    private String label;
    private boolean filled;
    public LabeledCircle() {
        super();
        this.label = "untitled";
        this.filled = false;
    }

    public LabeledCircle(double centerX, double centerY, double radius, String label, boolean filled) {
        super(centerX, centerY, radius);
        if (radius == 0.0)
            throw new IllegalArgumentException("Radius cannot be zero!");
        if (radius < 0.0)
            throw new IllegalArgumentException("Radius cannot be negative!");

        if (label == null) {
            this.label = "untitled";
        } else {
            this.label = label;
        }
        this.filled = filled;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String newLabel) {
        if (newLabel == null) {
            this.label = "untitled";
        } else {
            this.label = newLabel;
        }
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getDiameter() {
        return 2.0 * this.getRadius();
    }

    public double getDiameterDividedBy(double divisor) {
        if (divisor == 0.0)
            throw new ArithmeticException("Don't divide by zero!");
        return 2.0 * this.getRadius() / divisor;
    }

    public double getDiameterDividedBy(double divisor, String errorMessage) {
        if (divisor == 0.0)
            throw new ArithmeticException(errorMessage);
        return 2.0 * this.getRadius() / divisor;
    }

    public double setLabelDiameterDividedBy(double divisor, String newLabel) {
        try {
            return getDiameterDividedBy(divisor);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
            setLabel(newLabel);
            return 0.0;
        }
    }

    public void moveBy(double dx, double dy) {
        double newX = this.getCenterX() + dx;
        double newY = this.getCenterY() + dy;
        this.setCenter(newX, newY);
    }

    @Override
    public String toString() {
        return "LabeledCircle(center=(" + this.getCenterX() + ", " + this.getCenterY() + "), radius=" + this.getRadius() + ", label=\"" + this.label + "\", filled=" + this.filled + ")";
    }

    @Override
    public void setRadius(double newRadius) {
        if (newRadius == 0.0)
            throw new IllegalArgumentException("Radius cannot be zero!");
        if (newRadius < 0.0)
            throw new IllegalArgumentException("Radius cannot be negative!");
        super.setRadius(newRadius);
    }

    public static void main (String[] args){
        // test case 1
        try {
            LabeledCircle a = new LabeledCircle(1.0, 2.0, 0.0, "A", true);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        // Radius cannot be zero!

        // test case 2
        LabeledCircle b = new LabeledCircle(1.0, 2.0, 3.0, "B", false);
        try {
            double result = b.getDiameterDividedBy(0.0);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        // Don't divide by zero!

        // test case 3
        LabeledCircle c = new LabeledCircle(1.0, 2.0, 3.0, "C", true);
        try {
            c.setRadius(0.0);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        // Radius cannot be zero!
    }
}
