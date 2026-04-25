# Week 10: File I/O, List, Set and Map
## File Structure
- `Clock.java` - Lab Exercise #10.1 HouseOfClocks 2.0 
- `HouseOfClocks.java` - Lab Exercise #10.1 HouseOfClocks 2.0, Lab Challenge # 10.1 HouseOfCLocks 2.0 NumEarlierClocks
- `sameFirstLetter.java` - Lab Exercise #10.2 Same First Letter
- `countVowelFile.java` - Lab Challenge #10.2 Count Vowel File
- `printStatFile.java` - CW1 #10.1 Print Stat File
- `intersectList.java` - CW1 #10.2 List Intersection with Map
- `maxStretch.java` - Exercise #10.1 Max Stretch
- `isPartitionable.java` - Exercise #10.2 Partitionable
- `evenAppend.java` - Exercise #10.3 Even Append
## Tasks
### Lab Exercise # 10
#### Lab Exercise #10.1 HouseOfClocks 2.0 PrintClocksCollection
Complete the method `printClocksCollection` of the class `HouseOfClocks`. It prints all the clocks in this HouseOfClock's clock collection. It will print each clock on a new line with format `"Clock "` followed by the Clock format `HH:MM`. The `ArrayList` library is imported, there is no need to import other libraries.  
For example:  
Test:
```
HouseOfClocks hc = new HouseOfClocks();
hc.addClock(1, 30);
hc.addClock(12, 8);
hc.printClocksCollection();
```
Result:
```
Clock 01:30
Clock 12:08
```
#### Lab Exercise #10.2 Same First Letter
Given a list of non-empty strings, write a method that returns a `Map<String, String>` with a key for every different first letter seen, with the value of all the strings starting with that letter appended with a comma (`,`) together in the order they appear in the list.  
`Arrays`, `ArrayList`, `List`, `Map` and `HashMap` are imported.  

For example:  
Test case 1:  
`sameFirstLetter(["alice", "bob", "apple", "banana"]) →  {"a": "alice,apple", "b": "bob,banana"}`

Test case 2:  
`sameFirstLetter(["after", "all", "this", "time", "always"]) →  {"a":"after,all,always", "t": "this,time"}`
### Lab Challenge # 10.1 HouseOfCLocks 2.0 NumEarlierClocks
Complete the method `numEarlierClocks` of the class `HouseOfClocks`.  
It returns the number of clocks in this `HouseOfClock`'s clock collection that is earlier than that `Clock`.  
The `Arraylist` library is imported, there is no need to import other libraries.

For example:  
Test case 1:
```HouseOfClocks hc = new HouseOfClocks();
hc.addClock(1, 30);
hc.addClock(12, 8);

Clock c1 = new Clock(10, 45);
System.out.println(hc.numEarlierClocks(c1));
```
Result:
```
1
```

Test case 2:
```
HouseOfClocks hc = new HouseOfClocks();
hc.addClock(1, 30);
hc.addClock(12, 8);

Clock c2 = new Clock(14, 5);
System.out.println(hc.numEarlierClocks(c2));
```
Result:
```
2
```
### Lab Challenge #10.2 Count Vowel File
Complete the Java method `int countVowelFile(String filename)` that given a file name of a text file, return the number of vowels in the text file.

Import setting:  
`import java.io.*;`  
`import java.util.*;`

For example:  
Test:
```
System.out.println(countVowelFile("TestFile1.txt"));
```
Result:
```
4
```
### CW1 #10.1 Print Stat File
Complete the Java method void `printStatFile(String filename)` that given a file name of a text file,  
print the number of lines, words and characters in the text file.  
Import setting:  
`import java.io.*;`  
`import java.util.*;`
  

Test case:  
printStatFile("TestFile1.txt") →   
3  
7  
14
### CW1 #10.2 List Intersection with Map
Given two lists of strings, complete a function intersectList that returns a list of strings which appear in both input lists,  
i.e. the intersection of the input lists.  
  
`Arrays`, `ArrayList`, `List`, `Map` and `HashMap` are imported.  
  
Hint: Use map to keep track of the occurrences of the strings.  
  
Test case 1:  
`list1 = ["a", "b", "a", "c"]`
`list2 = ["b", "d", "a", "b", "b"]`
`intersectList(list1, list2)  →  ["a", "b"]`    (after sorted)
### Exercise #10
#### Exercise # 10.1 Max Stretch
We define the stretch of a number `x` in a list to be the how many numbers between two leftmost and rightmost number `x` in that list, inclusive.  
A single value in a list has a stretch of 1.  
Complete the method `maxStretch` that returns the largest stretch found in the input list.

For example:  
Test:
```
List<Integer> list1 = Arrays.asList(8, 5, 1, 2, 5, 3, 4, 5, 10);
System.out.println(maxStretch(list1));
```
Result:
```
7
```
Test:
```
List<Integer> list2 = Arrays.asList(2, 7, 1, 2, 3, 7);
System.out.println(maxStretch(list2));
```
Result:
```
5
```
#### Exercise #10.2 Partitionable
We define a list to be partitionable, if there is a place in between two indices in that list where the sum of the numbers on one side is equal to the sum of the numbers on the other side.  
Given as an input a non-empty list, complete the method `isPartitionable` that returns true if and only if the list is partitionable.
#### Exercise #10.3 Even Append
Given an input of a list of strings, write a method to build a result string as follows:
when a string appears the 2nd, 4th, 6th, etc. time in the list,
append the string to the result.
Return the empty string if no string appears a 2nd time.
You may use Map and HashMap.
The following are imported: `Arrays`, `List`, `ArrayList`, `Map`, `HashMap`.

For example:  
Test:
```
List<String> list = Arrays.asList("a", "b", "a");
System.out.println(evenAppend(list));
```
Result:
```
a
```

Test:
```
List<String> list = Arrays.asList("a", "b", "b", "a", "a");
System.out.println(evenAppend(list));
```
Result:
```
ba
```
## Approach

## Notes
- Each task is implemented as a separate class.