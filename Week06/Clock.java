public class Clock {
    private int hours;
    private int minutes;

    // Exercise #6.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        hours=h;
        minutes=m;
    }

    // Exercise #6.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        hours=Integer.parseInt(s.substring(0,2));
        minutes=Integer.parseInt(s.substring(3,5));
    }

    // Exercise #6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String hstr=Integer.toString(hours);
        String mstr=Integer.toString(minutes);
        if (hours<10){
            hstr="0"+hstr;
        }
        if (minutes<10){
            mstr="0"+mstr;
        }
        return hstr+":"+mstr;
    }

    // Exercise #6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (hours>that.hours){
            return false;
        }
        else if(hours==that.hours&&minutes>=that.minutes){
            return false;
        }
        else{
            return true;
        }
    }

    // Exercise #6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        if(minutes==59&&hours==23){
            minutes=0;
            hours=0;
        }
        else if(minutes==59){
            minutes=0;
            hours++;
        }
        else{
            minutes++;
        }
    }

    // Exercise #6.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        int totalMinutes = hours * 60 + minutes + delta;
        totalMinutes %= 24 * 60;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 0);
        Clock clock2 = new Clock("02:30");

        System.out.println(clock1); // 01:00
        System.out.println(clock2); // 02:30

        System.out.println(clock1.isEarlierThan(clock2)); // true

        clock1.tick();
        clock2.tock(100);

        System.out.println(clock1); // 01:01
        System.out.println(clock2); // 03:10

    }
}
