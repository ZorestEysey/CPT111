public class HouseOfClocks {
    private Clock[] clocksCollection;
    private int numClocks;

    public HouseOfClocks(int numClocks) {
        if (numClocks < 1 || numClocks > 24) {
            throw new IllegalArgumentException();
        }
        this.numClocks = numClocks;
        clocksCollection = new Clock[numClocks];
        for (int i = 0; i < numClocks; i++) {
            clocksCollection[i] = new Clock(i, 0);
        }
    }

    public HouseOfClocks(int nClock, int nAlarm, int nCuckoo, int nHalloween) {

        if (nClock < 0 || nClock > 24 || nAlarm < 0 || nAlarm > 24 ||
                nCuckoo < 0 || nCuckoo > 24 || nHalloween < 0 || nHalloween > 24) {
            throw new IllegalArgumentException();
        }

        int totalClocks = nClock + nAlarm + nCuckoo + nHalloween;
        if (totalClocks < 1 || totalClocks > 24) {
            throw new IllegalArgumentException();
        }

        this.numClocks = totalClocks;
        clocksCollection = new Clock[totalClocks];

        int clockIndex = 0;
        for (int i = clockIndex; i < clockIndex + nClock; i++) {
            clocksCollection[i] = new Clock(i, 0);
        }

        clockIndex = clockIndex + nClock;
        for (int i = clockIndex; i < clockIndex + nAlarm; i++) {
            clocksCollection[i] = new AlarmClock(i, 0, i+1, 0);
        }

        clockIndex = clockIndex + nAlarm;
        for (int i = clockIndex; i < clockIndex + nCuckoo; i++) {
            clocksCollection[i] = new CuckooClock(i, 0);
        }

        clockIndex = clockIndex + nCuckoo;
        for (int i = clockIndex; i < clockIndex + nHalloween; i++) {
            clocksCollection[i] = new HalloweenClock(i, 0);
        }

    }

    public void tick(int clockIndex) {
        if (clockIndex < 0 || clockIndex >= numClocks) {
            throw new IndexOutOfBoundsException("No clock stored at index " + clockIndex);
        }
        clocksCollection[clockIndex].tick();
    }


    public void printClocks() {
        for (int i = 0; i < numClocks; i++) {
            System.out.println(clocksCollection[i]);
        }
    }

    public static void main(String[] args) {
        // test case for Lab Challenge #9.1
        HouseOfClocks hc1 = new HouseOfClocks(3);
        hc1.printClocks();
        /*
        00:00
        01:00
        02:00
         */

        try {
            HouseOfClocks hc2 = new HouseOfClocks(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }
        // Too much clocks to store!

        // test case for Lab Challenge #9.2
        HouseOfClocks hc3 = new HouseOfClocks(1, 1, 1, 1);
        hc3.printClocks();
        for (int i = 0; i < 60; i++) {
            hc3.tick(1);
        }
        for (int i = 0; i < 60; i++) {
            hc3.tick(2);
        }
        for (int i = 0; i < 3; i++) {
            hc3.tick(3);
        }
        /*
        00:00
        01:00
        02:00
        03:00
        Beep beep beep beep!
        Cuckoo!
        Cuckoo!
        Cuckoo!
        Halloween!
         */

        try {
            HouseOfClocks hc4 = new HouseOfClocks(1, 1, 1, -1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("No negative arguments!");
        }

        try {
            HouseOfClocks hc5 = new HouseOfClocks(1, 1, 1, 100);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }
        /*
        No negative arguments!
        Too much clocks to store!
         */

        // test case for Lab Challenge #9.3
        HouseOfClocks hc6 = new HouseOfClocks(3);
        hc6.tick(0);
        hc6.tick(0);
        hc6.tick(1);
        hc6.printClocks();
        /*
        00:02
        01:01
        02:00
         */

        HouseOfClocks hc7 = new HouseOfClocks(3);

        try {
            hc7.tick(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        // No clock stored at index 100
    }

}
