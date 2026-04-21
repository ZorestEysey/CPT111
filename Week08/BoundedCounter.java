public class BoundedCounter extends Counter {
    private int max;


    // Lab 8 Challenge

    /* No-argument constructor: name="untitled", value=0, max=10 */
    public BoundedCounter() {
        super("untitled",0);
        this.max=10;
    }

    /* Full constructor */
    public BoundedCounter(String name, int initialValue, int max) {
        super(name,Math.min(initialValue,max));
        this.max=max;
    }

    public int getMax() {
        return max;
    }

    public boolean isAtMax() {
        return getValue()==max;
    }

    /* Overridden: increment only if not at max */
    @Override
    public void increment() {
        if(getValue()!=max){
            super.increment();
        }
    }

    /* Overridden: provide richer textual output */
    @Override
    public String toString() {
        return "BoundedCounter(name=\""+getName()+"\", value="+getValue()+", max="+getMax()+")";
    }
    public static void main (String[] args){
        BoundedCounter a = new BoundedCounter();
        System.out.println(a);
        a.increment();
        System.out.println(a.getValue());
        System.out.println(a.isAtMax());

        BoundedCounter b = new BoundedCounter("Study reps", 12, 10);
        System.out.println(b);
        b.increment();
        System.out.println(b.getValue());
        System.out.println(b.isAtMax());
    }
}
