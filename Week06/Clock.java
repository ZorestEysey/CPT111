public class Clock {
    private int hours;
    private int minutes;

    public Clock(int h, int m) {
        hours=h;
        minutes=m;
    }

    public Clock(String s) {
        hours=Integer.parseInt(s.substring(0,2));
        minutes=Integer.parseInt(s.substring(3,5));
    }

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
