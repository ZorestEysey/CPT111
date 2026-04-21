public class LabeledCircle extends Circle{
    private String label;
    private boolean filled;
    public LabeledCircle() {
        super();
        this.label = "untitled";
        this.filled = false;
    }

    public LabeledCircle(double centerX, double centerY, double radius, String label, boolean filled) {
        super(centerX, centerY, radius); // call parent constructor
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

    public void moveBy(double dx, double dy) {
        double newX = this.getCenterX() + dx;
        double newY = this.getCenterY() + dy;
        this.setCenter(newX, newY);
    }

    @Override
    public String toString() {
        return "LabeledCircle(center=(" + this.getCenterX() + ", " + this.getCenterY() + "), radius=" + this.getRadius() + ", label=\"" + this.label + "\", filled=" + this.filled + ")";
    }
}
