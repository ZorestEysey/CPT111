# Week 6: Introduction to Objects
## File Structure
- `Clock.java` - Lab Exercise #6
- `Temperature.java` - Lab 6 Challenge - Temperature Class
- `Circle.java` - CW1 #6.1 Circle Class
## Tasks
### Lab Exercise #6
#### Lab Exercise #6.1 Clock Constructor 1
Complete the first constructor of the class `Clock`.  
It takes two arguments: `h` and `m` and creates a new clock object whose initial time is `h` hours and `m` minutes.  
#### Lab Exercise #6.2 Clock Constructor 2
Complete the second constructor of the class `Clock`.

It takes one string argument:  `s`  
`s` is composed of two digits, followed by a colon, followed by two digits,  so the format is `HH:MM`  such as `02:30`

it creates a new clock object whose initial time is `HH` hours and `MM` minutes.
#### Lab Exercise #6.3 Clock toString
Complete the method `toString` of the class `Clock`.

It returns a string representation of this clock, using the format `HH:MM`

That is, the format is the hours (2 digits), followed by a colon, followed by the minutes (2 digits), for examples, `00:00` and `23:59`.
#### Lab Exercise #6.4 Clock isEarlierThan
Complete the method `isEarlierThan` of the class `Clock`.

It returns true if and only if the time on _this_ clock (the current referenced object) is earlier than the time on _that_ clock (in the argument).
#### Lab Exercise #6.5 Clock tick
Complete the method `tick` of the class Clock.

It adds 1 minute to the time on this clock.  

For example, one minute after `01:00` is `01:01`; one minute after `23:59` is `00:00`.
#### Lab Exercise #6.6 Clock tock
Complete the method `tock` of the class `Clock`.

It adds `delta` minute(s) to the time on this clock, where `delta` is a positive integer.  
For example, 100 minutes after `02:30` is `04:10`.

Note that you must **not** use the method in CW1 #6.5 tick().

For example:  
Test:  
```
Clock clock1 = new Clock(1, 0);
Clock clock2 = new Clock("02:30");
System.out.println(clock1);
System.out.println(clock2);

System.out.println(clock1.isEarlierThan(clock2));
clock1.tick();
clock2.tock(100);
System.out.println(clock1);
System.out.println(clock2);
```

Result:
```
01:00
02:30
true
01:01
04:10
```
### Lab 6 Challenge - Temperature Class
Complete the `Temperature` class, including all constructors, getters, setters, and methods exactly as listed in the lab sheet.

Lab sheet:
```
public class Temperature {
    private double celsius;

    public Temperature() {
        // TODO: set the initial value of celsius to 0.0
    }

    public Temperature(double celsius) {
        // TODO: set the initial value for celsius
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        // TODO: calculate and return Fahrenheit equivalent
        return 0.0;
    }

    public void increase(double deltaC) {
        // TODO: add deltaC to current celsius value (can be negative)
    }

    public boolean isBelowFreezing() {
        // TODO: return true of the temperature is strictly less than 0.0°C, false if not
        return false;
    }

    public String toString() {
        // TODO: return properly formatted string
        return "";
    }
}
```

For example:  
Test:  
```
Temperature t0 = new Temperature();
System.out.println(t0.getCelsius());
System.out.println(t0.getFahrenheit());
System.out.println(t0);
```
Result:  
```
0.0
32.0
0C (32F)
```

Test:
```
Temperature t1 = new Temperature(-1.5);
System.out.println(t1.isBelowFreezing());
t1.increase(3.0);
System.out.println(t1.isBelowFreezing());
System.out.println(t1.getFahrenheit());
```
Result:
```
true
false
34.7
```
### CW1 #6.1 Circle Class
Instructed in the file `CW6.1_Task_Sheet.pdf`.
## Approach
## Notes
- Each task is implemented as a separate class.
