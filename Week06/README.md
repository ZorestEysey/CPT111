# Week 6: Introduction to Objects
## File Structure

## Tasks

## Approach
### Lab Exercise #6
#### Lab Exercise #6.1 Clock Constructor 1
Complete the first constructor of the class `Clock`.  
It takes two arguments: `h` and `m` and creates a new clock object whose initial time is `h` hours and `m` minutes.  
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

## Notes

- Each task is implemented as a separate class.
