public class Clock {
    private int hours;
    private int minutes;

    public Clock(int h, int m) {
        if(h>=0&&h<=23&&m>=0&&m<=59){
            this.hours=h;
            this.minutes=m;
        }
        else {
            throw new IllegalArgumentException("Check your input h and m");
        }
    }

    public Clock(String s) {
        if (s.length()==5&&Character.isDigit(s.charAt(0))&&Character.isDigit(s.charAt(1))&&s.charAt(2)==':'&&Character.isDigit(s.charAt(3))&&Character.isDigit(s.charAt(4))&&Integer.parseInt(s.substring(0,2))>=0&&Integer.parseInt(s.substring(0,2))<=23&&Integer.parseInt(s.substring(3,5))>=0&&Integer.parseInt(s.substring(3,5))<=59){
            this.hours=Integer.parseInt(s.substring(0,2));
            this.minutes=Integer.parseInt(s.substring(3,5));
        }
        else {
            throw new IllegalArgumentException("Check your input string");
        }
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

    public void tock(int delta){
        if (delta < 0)
            throw new IllegalArgumentException("Illegal negative delta "+ delta);
        int deltaHours = delta / 60;
        int deltaMinutes = delta % 60;
        hours = (hours + deltaHours) % 24;
        minutes += deltaMinutes;
        if (minutes >= 60){
            hours++;
            minutes = minutes % 60;
            if (hours == 24){hours = 0;}
        }
    }

    public static void tick(Clock clock) {
        clock.tick();
    }

    public static void main(String[] args) {
        // test case for Lab Exercise #9.1
        Clock clock1 = new Clock(1, 0);
        System.out.println(clock1); // 01:00

        try {
            Clock clock2 = new Clock(50, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 1!");
        }
        // Invalid argument in constructor 1!

        // test case for Lab Exercise #9.2
        Clock clock3 = new Clock("02:30");
        System.out.println(clock3); // 02:30

        try {
            Clock clock4 = new Clock("50:00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }
        // Invalid argument in constructor 2!

        // test case for Lab Exercise #9.3
        Clock clock5 = new Clock("02:30");
        clock5.tock(100);
        System.out.println(clock5); // 04:10

        Clock clock6 = new Clock("02:30");
        try {
            clock5.tock(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Illegal negative delta -50

        // test case for Lab Exercise #9.4
        AlarmClock clock7 = new AlarmClock(5, 59, 6, 0);
        Clock.tick(clock6); // Beep beep beep beep!

        Clock clock = new Clock("02:30");
        Clock.tick(clock);
        System.out.println(clock); // 02:31

        HalloweenClock hc = new HalloweenClock(1, 0);
        Clock.tick(hc);
        Clock.tick(hc);
        Clock.tick(hc); // Halloween!
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }

}
