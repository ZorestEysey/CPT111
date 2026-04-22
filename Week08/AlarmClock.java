public class AlarmClock extends Clock {

    private int alarmHours;
    private int alarmMinutes;
    String alarmSound;
    
    public AlarmClock(int h, int m, int alarmHours, int alarmMinutes) {
        super(h,m);
        this.alarmHours=alarmHours;
        this.alarmMinutes=alarmMinutes;
        alarmSound="Beep beep beep beep!";
    }

    public AlarmClock(int h, int m, int alarmHours, int alarmMinutes, String alarmSound) {
        super(h,m);
        this.alarmHours=alarmHours;
        this.alarmMinutes=alarmMinutes;
        this.alarmSound=alarmSound;
    }

    @Override
    public void tick() {
        super.tick();
        if( alarmHours==getHours() && alarmMinutes==getMinutes()){
            System.out.println(alarmSound);
        }
    }

    public static void main(String[] args) {
        AlarmClock ac1 = new AlarmClock(5, 58, 6, 0);
        ac1.tick();
        ac1.tick();  // Beep beep beep beep!  
        System.out.println(ac1);  // 06:00  

        AlarmClock ac2 = new AlarmClock(14, 29, 14, 30, "Wake Up! The Hero! Kamen Rider!");
        ac2.tick();  // Wake Up! The Hero! Kamen Rider!  
    }
}
