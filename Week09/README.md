# Week 9: Objects, Inheritances and Polymorphism, and Exception Handling
## File Structure
- `Clock.java` - Lab Exercise #9
- `HouseOfClocks.java` - Lab Challenge #9
- `LabeledCircle.java` - CW1 #9.1 Labeled Circle with Exceptions
## Tasks
### Lab Exercise #9
#### Lab Exercise #9.1 # Clock Constructor 1
Complete the first constructor of the class `Clock`.

It takes two arguments: `h` and `m`, and creates a new clock object whose initial time is `h` hours and `m` minutes.

Throws an `IllegalArgumentException` if either `hours` is not between 0 and 23,  
or `minutes` not between 0 and 59.

For example:  
Test:
```
Clock clock1 = new Clock(1, 0);
System.out.println(clock1);
```
Result:
```
01:00
```

Test:
```
try {
    Clock clock2 = new Clock(50, 0);
} catch (IllegalArgumentException e) {
    System.out.println("Invalid argument in constructor 1!");
}
```
Result:
```
Invalid argument in constructor 1!
```
#### Lab Exercise #9.2 Clock Constructor 2
Complete the second constructor of the class Clock.

It takes one string argument:  `s`.  
`s` is composed of two digits, followed by a colon, followed by two digits,  
so the format is `HH:MM`  such as `02:30`.

it creates a new clock object whose initial time is `HH` hours and `MM` minutes.

Throws an `IllegalArgumentException` if either the string argument is not in this format,  
or if it does not correspond to a valid time between `00:00` and `23:59`.

For example:  
Test:
```
Clock clock3 = new Clock("02:30");        
System.out.println(clock3);
```
Result:
```
02:30
```

Test:
```
try {
    Clock clock4 = new Clock("50:00");
} catch (IllegalArgumentException e) {
    System.out.println("Invalid argument in constructor 2!");
}
```
Result:
```
Invalid argument in constructor 2!
```
#### Lab Exercise #9.3 Clock Tock
Complete the method `tock` of the class `Clock`.

It adds `delta` minute(s) to the time on this clock, where `delta` is a positive integer,  
for example,  100 minutes after 02:30 is 04:10.

Note that must not use the method in `CW1 #7.5 tick()`

Throws an `IllegalArgumentException` if `delta` is negative,  
and use the message `"Illegal negative delta"` followed by the negative number.

For example:  
Test:
```
Clock clock5 = new Clock("02:30");
clock5.tock(100);
System.out.println(clock5);
```
Result:
```
04:10
```

Test:
```
Clock clock5 = new Clock("02:30");

try {
    clock5.tock(-50);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
```
Result:
```
Illegal negative delta -50
```
#### Lab Exercise #9.4 Clock Polymorphic Tick Function
Complete the `tick` function of the class `Clock`.

It takes a `Clock` object `clock` and calls the `tick` method on it.

It is polymorphic because you can pass an object of a subclass of `Clock` which overrides `tick`.

For example:  
Test:
```
AlarmClock clock6 = new AlarmClock(5, 59, 6, 0);
Clock.tick(clock6);
```
Result:
```
Beep beep beep beep!
```

Test:
```
Clock clock = new Clock("02:30");
Clock.tick(clock);
System.out.println(clock);
```
Result:
```
02:31
```

Test:
```
HalloweenClock hc = new HalloweenClock(1, 0);
Clock.tick(hc);
Clock.tick(hc);
Clock.tick(hc);
```
Result:
```
Halloween!
```
### Lab Challenge #9
#### Lab Challenge #9.1 House of Clocks Constructor
Complete the first constructor of the class `HouseOfClocks`.

It creates a house of clocks which has a collection of `numClocks` clocks.  

`numClocks` must be between 1 and 24, inclusive;    
and the method must throw `IllegalArgumentException`, otherwise.  
The first clock must start at 00:00, the second clock at 01:00, and so on.

For example,  
- if `numClocks = 3`,    it stores 3 clocks starting at 00:00, 01:00, and 02:00  
- if `numClocks = 24`,  it stores 24 clocks where the last one at index 23 starts at 23:00

For example:  
Test:
```
HouseOfClocks hc1 = new HouseOfClocks(3);
hc1.printClocks();
```
Result:
```
00:00
01:00
02:00
```

Test:
```
try {
    HouseOfClocks hc2 = new HouseOfClocks(100);
} catch (IllegalArgumentException e) {
    System.out.println("Too much clocks to store!");
}
```
Result:
```
Too much clocks to store!
```
#### Lab Challenge #9.2 House of Clocks Constructor 2
Complete the second constructor of the class `HouseOfClocks`.

It creates a house of clocks which has a collection of four types of clocks in Week 9:   
- `nClock`, `nAlarm`, `nCuckoo`, `nHalloween` number of `Clock`, `AlarmClock`, `CuckooClock`, and `HalloweenClock` objects, respectively.  
- all number of clock of any types must be between 0 and 24, inclusive;  
- the total number of clocks must be between 1 and 24, inclusive;   
- and throws `IllegalArgumentException`, otherwise.  
- the first clock must start at 00:00, the second clock at 01:00, and so on.  
- the alarm time of the `AlarmClock` objects must be 1 hour after the starting time.  
  
For example, if `nClock = 1`, `nAlarm = 1`, `nCuckoo = 1`, `nHalloween = 1`,  
- it stores total of 4 clocks where the first clock at index 0 is a Clock object starts at 00:00,  
- the second clock at index 1 is an `AlarmClock` object starts at 01:00,  
- the third clock at index 2 is a `CuckooClock` object starts at 02:00,  
- and the fourth clock at index 3 is a `HalloweenClock` object starts at 03:00.

For example:  
Test:
```
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
```
Result:
```
00:00
01:00
02:00
03:00
Beep beep beep beep!
Cuckoo!
Cuckoo!
Cuckoo!
Halloween!
```

Test:
```
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
```
Result:
```
No negative arguments!
Too much clocks to store!
```
#### Lab Challenge #9.3 House of Clocks Polymorphic Tick
Complete the method `tick` of the class `HouseOfClocks`.

Use polymorphism to call the `tick` method of the clock in the collection at index `clockIndex`;

but, throw an `IndexOutOfBoundsException` if the clockIndex is not valid,

and use the message `"No clock stored at index"` followed by the invalid index.

For example:  
Test:
```
HouseOfClocks hc1 = new HouseOfClocks(3);
hc1.tick(0);
hc1.tick(0);
hc1.tick(1);
hc1.printClocks();
```
Result:
```
00:02
01:01
02:00
```

Test:
```
HouseOfClocks hc2 = new HouseOfClocks(3);

try {
    hc2.tick(100);
} catch (IndexOutOfBoundsException e) {
    System.out.println(e.getMessage());
}
```
Result:
```
No clock stored at index 100
```
### CW1 #9.1 Labeled Circle with Exceptions
Improve the `LabeledCircle` class, the subclass of Circle last week (Week 8) to also handle exceptional behaviors using exceptions, including all constructors and methods, exactly as listed in the task sheet.

For example:  
Test:
```
try {
    LabeledCircle a = new LabeledCircle(1.0, 2.0, 0.0, "A", true);
} catch (IllegalArgumentException iae) {
    System.out.println(iae.getMessage());
}
```
Result:
```
Radius cannot be zero!
```

Test:
```
LabeledCircle b = new LabeledCircle(1.0, 2.0, 3.0, "B", false);
try {
    double result = b.getDiameterDividedBy(0.0);
} catch (ArithmeticException ae) {
    System.out.println(ae.getMessage());
}
```
Result:
```
Don't divide by zero!
```

Test:
```
LabeledCircle c = new LabeledCircle(1.0, 2.0, 3.0, "C", true);
try {
    c.setRadius(0.0);
} catch (IllegalArgumentException iae) {
    System.out.println(iae.getMessage());
}
```
Result:
```
Radius cannot be zero!
```
## Approach

## Notes
- Each task is implemented as a separate class.
