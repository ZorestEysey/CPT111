# Week 11: Recursion and Date
## File Structure
- `numXY.java` - Exercise #11.1 Recursive numXY
- `remDup.java` - Exercise #11.2 Recursive Remove Duplicates
- `sepStar.java` - Exercise #11.3 Recursive Separate Star
- `checkAllLowercase.java` - CW1 #11.1 Check All Lowercase
## Tasks
### Exercise #11.1 Recursive numXY
Complete the method numXY.

It finds the number of times the string "XY" appears in the input string _recursively_.

You must **not** use any loops or regular expressions.

Test cases:  
`numXY("AAXYAA") → 1`  
`numXY("AXYBXYAA") → 2`
### Exercise #11.2 Recursive Remove Duplicates
Complete the method remDup.

It reduces all adjacent same characters that appear in the input string to a single character _recursively_.

You must **not** use any loops or regular expressions.

Test cases:  
`remDup("hello") → "helo"`  
`remDup("abbbcd") → "abcd"`
### Exercise #11.3 Recursive Separate Star
Complete the method sepStar.

It separates all identical adjacent characters that appear in the input string from each other by "\*" _recursively_.

You must **not** use any loops or regular expressions.

Test cases:  
`sepStar("hello") → "hel*lo"`  
`sepStar("uuvxxyzzz") → "u*uvx*xyz*z*z"`

### CW1 #11.1 Check All Lowercase
Complete the following Java method **checkAllLowercase** that given a string contained _only letters_, returns **true** if the string is composed of all lowercase letters, and **false** otherwise, using **_recursion_**.

You must use recursion;  
and must **not** use any loops or regular expressions, in which case it will be graded 0 marks.

Test cases:  
```java
String str1 = "abcd";  
System.out.println(checkAllLowercase(str1));   →  true  
String str2 = "xYz";  
System.out.println(checkAllLowercase(str2));   →  false
```
## Approach

## Notes

- Each task is implemented as a separate class.
