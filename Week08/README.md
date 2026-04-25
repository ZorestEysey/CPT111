# Week 8: More Objects and Inheritance
## File Structure
- `Clock.java` - Exercise #8
- `AlarmClock.java` - Exercise #8.1 Alarm Clock Constructor 1, Exercise #8.2 Alarm Clock Constructor 2, Exercise #8.3 Alarm Clock Tick
- `CuckooClock.java` - Exercise #8.4 Cuckoo Clock Constructor, Exercise #8.5 Cuckoo Clock Tick
- `HalloweenCLock.java` - Exercise #8.6 Halloween Clock Constructor, Exercise #8.7 Halloween Clock Tick
- `Counter.java` - Lab 8 Challenge - Bounded Counter
- `BoundedCounter.java` - Lab 8 Challenge - Bounded Counter
- `LabeledCiecle.java` - CW1 #8.1 Labeled Circle
## Tasks
### Exercise #8
Update `Clock.java` in `Week06` by `Clock.java` in `Week08`.
#### Exercise #8.1 Alarm Clock Constructor 1
Complete the first constructor of the class `AlarmClock`.

It takes four arguments: `h`, `m`, `alarmHours`, `alarmMinutes`, creates a new `AlarmClock` object whose initial time is `h` hours and `m` minutes, and sounds an alarm at `alarmHours` hours and `alarmMinutes` minutes, with the default sound `"Beep beep beep beep!"`.
#### Exercise #8.2 Alarm Clock Constructor 2
Complete the second constructor of the class `AlarmClock`.

Overloading the first constructor, it now takes five arguments: `h`, `m`, `alarmHours`, `alarmMinutes`, and `alarmSound`, creates a new `AlarmClock` object whose initial time is `h` hours and `m` minutes, sounds an alarm at `alarmHours` hours and `alarmMinutes` minutes, and sets the sound to `alarmSound`.
#### Exercise #8.3 Alarm Clock Tick
Complete the method tick of the class `AlarmClock`.

It overrides the method `tick` of `Clock` and adds 1 minute to the time on this alarm clock.  
In addition, it sounds (prints) the alarm at the specified time.
  
For example:  
Test:
```
AlarmClock ac1 = new AlarmClock(5, 58, 6, 0);
ac1.tick();
ac1.tick();
System.out.println(ac1);
        
AlarmClock ac2 = new AlarmClock(14, 29, 14, 30, "Wake Up! The Hero! Kamen Rider!");
ac2.tick();
```
Result:
```
Beep beep beep beep!
06:00
Wake Up! The Hero! Kamen Rider!
```
#### Exercise #8.4 Cuckoo Clock Constructor
Complete the constructor of the class `CuckooClock`.

It takes two arguments: `h` and `m`, and creates a new `CuckooClock` object whose initial time is `h` hours and `m` minutes.
#### Exercise #8.5 Cuckoo Clock Tick
Complete the method `tick` of the class `CuckooClock`.

It overrides the method `tick` of `Clock` and adds 1 minute to the time on this Cuckoo clock.  

In addition,  it prints "Cuckoo!" at the start of every hour.  
It prints one time for each hour.  
Whether it is morning or night does not change the number of times it prints.

For example, for 14:00, it prints `"Cuckoo!"` two times;  
and for 00:00 and 12:00, it prints `"Cuckoo!"` twelve times.

For example:  
Test:
```
CuckooClock cc1 = new CuckooClock(0, 58);
cc1.tick();
cc1.tick();
System.out.println(cc1);
        
CuckooClock cc2 = new CuckooClock(13, 59);
cc2.tick();
```
Result:
```
Cuckoo!
01:00
Cuckoo!
Cuckoo!
```
#### Exercise #8.6 Halloween Clock Constructor
Complete the constructor of the class `HalloweenClock`.

It takes two arguments: `h` and `m`, and creates a new `HalloweenClock` object whose initial time is `h` hours and `m` minutes.
#### Exercise #8.7 Halloween Clock Tick
Complete the constructor of the class `HalloweenClock`.

It overrides the method `tick` of `Clock`,  adds 1 minute to the time on this Halloween clock and if any Halloween clocks have ticked three times,  prints `"Halloween!"`.

For example:  
Test:
```
HalloweenClock hc1 = new HalloweenClock(1, 0);
HalloweenClock hc2 = new HalloweenClock(2, 0);
hc1.tick();
hc2.tick();
hc2.tick();
        
HalloweenClock hc3 = new HalloweenClock(3, 30);
hc1.tick();
hc2.tick();
hc3.tick();
System.out.println(hc3);
```
Result:
```
Halloween!
Halloween!
03:31
```
### Lab 8 Challenge - Bounded Counter
Complete the BoundedCounter class that extends the Counter class, including all constructors, getters, setters, and methods exactly as listed in the lab sheet.  
Lab sheet:
```java
public class Counter {  
    private String name;  
    private int value; // always >= 0  
  
    /* No-arg constructor: name="untitled", value=0 */
	public Counter() {  
        this("untitled", 0);  
    }  
  
    /* Full constructor. If initialValue < 0, store 0. If name is null, store "untitled". */  
    public Counter(String name, int initialValue) {  
        this.name = (name == null) ? "untitled" : name;  
        this.value = Math.max(0, initialValue);  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public int getValue() {  
        return value;  
    }  
  
    public void setName(String newName) {  
        if (newName == null) {  
            newName = "untitled";  
        }  
        this.name = newName;  
    }  
  
    /* Increase value by 1. */  
    public void increment() {  
        value++;  
    }  
  
    /* Reset value to 0. */  
    public void reset() {  
        value = 0;  
    }  
  
    /* String form: Counter(name="X", value=Y) */  
    @Override  
    public String toString() {  
        return "Counter(name=\"" + name + "\", value=" + value + ")";  
    }  
}
public class BoundedCounter extends Counter {  
    private int max;  
	// Lab 8 Challenge  
  
    /* No-argument constructor: name="untitled", value=0, max=10 */      public BoundedCounter() {}  
  
    /* Full constructor */  
    public BoundedCounter(String name, int initialValue, int max) {}  
    public int getMax() {}  
  
    public boolean isAtMax() {}  
  
    /* Overridden: increment only if not at max */  
    @Override  
    public void increment() {}  
  
    /* Overridden: provide richer textual output */  
    @Override  
    public String toString() {}  
}
```
For example:
Test:
```
BoundedCounter a = new BoundedCounter();
System.out.println(a);
a.increment();
System.out.println(a.getValue());
System.out.println(a.isAtMax());
```
Result:
```
BoundedCounter(name="untitled", value=0, max=10)
1
false
```

Test:
```
BoundedCounter b = new BoundedCounter("Study reps", 12, 10);
System.out.println(b);
b.increment();
System.out.println(b.getValue());
System.out.println(b.isAtMax());
```
Result:
```
BoundedCounter(name="Study reps", value=10, max=10)
10
true
```
#### CW1 #8.1 Labeled Circle
Complete the LabeledCircle class, including all constructors, getters, setters, and methods exactly as listed in `CW8.1_Task_Sheet.pdf`.  
For example:  
Test:
```
LabeledCircle a = new LabeledCircle();
System.out.println(a);
System.out.println(a.getDiameter());
```
Result:
```
LabeledCircle(center=(0.0, 0.0), radius=1.0, label="untitled", filled=false)
2.0
```

Test:
```
LabeledCircle b = new LabeledCircle(2.0, -1.5, 3.0, "Room A", true);
System.out.println(b.getRadius());
System.out.println(b.isFilled());
b.moveBy(-2.0, 1.5);
System.out.println(b);
```
Result:
```
3.0
true
LabeledCircle(center=(0.0, 0.0), radius=3.0, label="Room A", filled=true)
```

Test:
```
Circle ref = new LabeledCircle(1.0, 1.0, 2.0, "C2", false);
System.out.println(ref.getArea());
System.out.println(ref);
```
Result:
```
12.566370614359172
LabeledCircle(center=(1.0, 1.0), radius=2.0, label="C2", filled=false)
```
## Approach

- **Exercise #8 Clock Update**  
  Added public getters `getHours()` and `getMinutes()` to `Clock` so that subclasses (`AlarmClock`, `CuckooClock`, `HalloweenClock`) can read the current time without accessing private fields directly.

- **Exercise #8.1 Alarm Clock Constructor 1**  
  Calls `super(h, m)` to set the initial clock time, then stores the alarm time (`alarmHours`, `alarmMinutes`) and sets the alarm sound to the default `"Beep beep beep beep!"`.

- **Exercise #8.2 Alarm Clock Constructor 2**  
  Similar to the first constructor, but also accepts a custom `alarmSound` string and stores it instead of the default.

- **Exercise #8.3 Alarm Clock Tick**  
  Overrides `tick()`: first calls `super.tick()` to advance the clock by one minute, then checks if the current time (`getHours()` and `getMinutes()`) matches the stored alarm time. If it does, the alarm sound is printed.

- **Exercise #8.4 Cuckoo Clock Constructor**  
  Simply calls `super(h, m)` to set the initial time. No additional state is needed.

- **Exercise #8.5 Cuckoo Clock Tick**  
  Overrides `tick()`: after calling `super.tick()`, if the minutes become `0`, it prints `"Cuckoo!"` exactly `getHours()` times (using a loop).

- **Exercise #8.6 Halloween Clock Constructor**  
  Calls `super(h, m)` to set the initial time. Uses a `static` counter (`numOfTicks`) shared across all `HalloweenClock` instances to track the total number of ticks.

- **Exercise #8.7 Halloween Clock Tick**  
  Overrides `tick()`: after calling `super.tick()`, increments the shared `numOfTicks`. When the counter reaches 3, it prints `"Halloween!"` and resets the counter to 0.

- **Lab 8 Challenge – BoundedCounter**  
  Extends `Counter` with a `max` field.  
  – The no‑arg constructor sets `max = 10` (value and name are handled by `super()`).  
  – The full constructor passes `name` and `Math.min(initialValue, max)` to `super()`, then stores `max`.  
  – `getMax()` returns `max`; `isAtMax()` checks whether `getValue() == max`.  
  – `increment()` is overridden to call `super.increment()` only if the current value is **not** at the maximum.  
  – `toString()` returns a string of the form `"BoundedCounter(name=\"...\", value=..., max=...)"`.

- **CW1 #8.1 LabeledCircle**  
  Extends `Circle` by adding a `label` (String) and a `filled` (boolean) field.  
  – The no‑arg constructor calls `super()` (centre at origin, radius 1.0) and sets `label = "untitled"`, `filled = false`.  
  – The full constructor calls `super(centerX, centerY, radius)`, then stores `label` (defaulting to `"untitled"` if `null`) and `filled`.  
  – Getters and setters are provided for both new fields; `setLabel` also guards against `null`.  
  – `getDiameter()` returns `2.0 * getRadius()`.  
  – `moveBy(dx, dy)` computes the new centre using the existing getters and applies it with `setCenter`.  
  – `toString()` overrides `Circle`’s version to include the label (in escaped double quotes) and the filled status: `"LabeledCircle(center=(x, y), radius=r, label=\"...\", filled=bool)"`.
## Notes

- Each task is implemented as a separate class.
