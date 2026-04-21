public class Temperature {
    private double celsius;
    public Temperature() {
        // TODO: set the initial value of celsius to 0.0
        celsius=0.0;
    }

    public Temperature(double celsius) {
        // TODO: set the initial value for celsius
        this.celsius=celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        // TODO: calculate and return Fahrenheit equivalent
        double fah=celsius*1.8+32;
        return fah;
    }

    public void increase(double deltaC) {
        // TODO: add deltaC to current celsius value (can be negative)
        celsius=celsius+deltaC;
    }

    public boolean isBelowFreezing() {
        // TODO: return true of the temperature is strictly less than 0.0°C, false if not
        if (celsius<0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        // TODO: return properly formatted string
        String rC=Integer.toString((int)Math.round(celsius));
        String rF=Integer.toString((int)Math.round(getFahrenheit()));
        return rC+"C ("+rF+"F)";
    }

    public static void main (String[] args){
        Temperature t0 = new Temperature();
        System.out.println(t0.getCelsius()); // 0.0
        System.out.println(t0.getFahrenheit()); // 32.0
        System.out.println(t0); // 0C (32F)
        Temperature t1 = new Temperature(-1.5);
        System.out.println(t1.isBelowFreezing()); // true
        t1.increase(3.0);
        System.out.println(t1.isBelowFreezing()); // false
        System.out.println(t1.getFahrenheit()); // 34.7
    }
}
