# Week 5: Static Methods 2 and Strings
## File Structure
- `warAndPeace.java` - Lab Exercise 5.1 War and Peace
- `removeLeftmostSubstring.java` - Lab 5 Challenge - Remove All Leftmost Substring
- `isValidID.java` - Exercise #5.1 Valid ID and Check Digit
- `sandwichFillings.java` - Exercise #5.2 Sandwich Fillings
- `calcNetIncome.java` - Exercise #5.3 Calculate Net Income
- `diamond.java` - Exercise #5.4 A Diamond is FORever
- `evenOddSwap.java` - Exercise #5.5 Even Odd Swap
- `twoSwappable.java` - Exercise #5.6 Two Swappable
- `revNum.java` - CW1 #5.1 Reverse Numbers
## Tasks
### Lab Exercise 5.1 War and Peace
Write a Java method that given a string text, returns true if the string "war" and "peace" appear the same number of times in text.
All input letters are in lowercase.  
  

Test cases :  
`warAndPeace("there was never a good war, or a bad peace") → true`  
`warAndPeace("war what is it good for") → false`
### Lab 5 Challenge - Remove All Leftmost Substring
Complete the method removeLeftmostSubstring.

The method removes the leftmost occurrence of target substring from input string, repeatedly on the resulting string, until all occurrences of target are removed.  
It returns the resulting string after repeated removal.

You must use String methods in lecture notes.  
You must NOT use StringBuilder, Java Util, or Regular Expression methods: append, matches, replaceAll.

Test cases:

`removeLeftmostSubstring("abcd", "abc") → "d"`

`removeLeftmostSubstring("ababccd", "abc") → "abcd" → "d"` 

(two removals happened in the last test case)
### Exercise #5.1 Valid ID and Check Digit
You work for a manufacturer that makes a product with a unique ID string to encode the attributes of the product.  
The last character of the ID is a check digit which is the sum of the digits '0-9' that appear in the ID, ignoring all other characters, modulo 11, using the character 'X' if the remainder is 10.
Write a Java method that takes an ID string and determines whether or not it is a valid ID number.  
Note that an ID string is of length at least 5, uses upper or lower case letters, as well as dashes '-'.  
  
Note that Character.isDigit(char) tests if a char is one of the chars '0', '1', ..., '9'. Also recall that Integer.parseInt(string) converts a string to an int.  
  

Test cases :  
`isValidID("THMBB7092WD114221") → false`  
`isValidID("A001-606X-17X") → true`
### Exercise #5.2 Sandwich Fillings
A sandwich is two pieces of bread with fillings in between (possibly another bread).  
Write a Java method that returns the string that is between the _first_ and _last_ appearance of "bread" in the given input string, or return the string "none" if there are not two pieces of bread.
All input letters are in lowercase.  
  

Test cases :  
`sandwichFillings("breadtunabread") → "tuna"`  
`sandwichFillings("chipsbreadtunasalad") → "none"`
### Exercise #5.3 Calculate Net Income
To create a home budget, you want to find out your net income, which is your income minus your expenses.  
  
Write a Java method that takes an input string and computes the income minus the expenses.  
The income components are indicated by numbers; while the expenses from your spending are numbers starting with a minus sign '-'.
The input string may contain lowercase and uppercase letters, as well as other characters.  
Note that Character.isDigit(char) tests if a char is one of the chars '0', '1', ..., '9'. Also recall that Integer.parseInt(string) converts a string to an int.  
  

Test cases :  
`calcNetIncome("salary 15000yuan bonus2000 rent -1000Y") → 16000`  
`calcNetIncome("25000 gross income, -200 water, electricity:-300") → 24500`
### Exercise #5.4 A Diamond is FORever
Write a Java static method  void diamond(int n) that takes an _**odd**_integer argument n and prints an n-by-n pattern like the test cases below, with an _asterisk_ (*) for each element which makes up a diamond, and a _dot_ (.) for each entry that is not, and _one space_ between each * or .
Test cases :

diamond(5)  
```
. . * . .

. * * * .

* * * * *

. * * * .

. . * . .
```
diamond(9)  
```
. . . . * . . . .

. . . * * * . . .

. . * * * * * . .

. * * * * * * * .

* * * * * * * * *

. * * * * * * * .

. . * * * * * . .

. . . * * * . . .

. . . . * . . . .
```
### Exercise #5.5 Even Odd Swap
Write a Java static method int[] evenOddSwap(int[] nums) that given an integer array containing the same number of even and odd numbers, swap all pairs of even and odd numbers in the order of their appearance.
Test cases :  
`evenOddSwap([1, 2, 3, 4]) → [2, 1, 4, 3]`

`evenOddSwap([100, 25]) → [25, 100]`

`evenOddSwap([]) → []`

`evenOddSwap([11, 55, 100, 200, 300, 7]) → [100, 200, 11, 55, 7, 300]`
### Exercise #5.6 Two Swappable
Two strings, s1 and s2, are **two-swappable** if for any two indices i and j such that i < j and the difference j - i is **_two_**, one can swap the two characters at those indices in the string s1 multiple times, and make s1 and s2 **_equal_**.
Complete the function twoSwappable that given two strings s1 and s2, both of length **5**, consisting of lowercase English letters, returns true if strings s1 and s2 are **two-swappable**, and false otherwise.

Test cases:  
`twoSwappable("abcde", "cdabe") → true`  
`twoSwappable("abcde", "edcba") → true`  
`twoSwappable("abcde", "daceb") → false`
### CW1 #5.1 Reverse Numbers
Complete the method revNum.

Given a string input that consists of letters, or other characters (such as whitespace, numbers, punctuation), return the string where all numbers reverse their positions, but all characters that are not a number remain in the same position.

You must use String methods in the lecture notes.  
You must NOT use StringBuilder or Regular Expression methods: append, matches, replaceAll.

Test case:  

`revNum("x123_#_4567 yz") → "x765_#_4321 yz"`

The positions of numbers 123 4567are reversed to 765 4321 while other characters are kept the same.
## Approach
- **Lab Exercise 5.1 War and Peace**:  
  Count occurrences of `"war"` and `"peace"` by iterating through the string and checking substrings of the respective lengths using `substring()` and `equals()`. Return `true` if the counts are equal, otherwise `false`.
- **Lab 5 Challenge - Remove All Leftmost Substring**:  
  Repeatedly find the leftmost occurrence of the target using `indexOf()` and remove it by concatenating the substring before and after the target until the target no longer appears in the string (`contains()`). Return the final string.
- **Exercise #5.1 Valid ID and Check Digit**:  
  Sum all digit characters (except the last character) using `Character.isDigit()` and `Character.getNumericValue()`. Compute the sum modulo 11; if the remainder is 10 the check digit should be `'X'`, else it should be the corresponding digit character. Compare the computed check digit with the last character of the ID string. Also validate that all other characters are letters, digits, or dashes.
- **Exercise #5.2 Sandwich Fillings**:  
  Locate the first and last occurrence of `"bread"` using `indexOf()` and `lastIndexOf()`. If either is `-1` or they are the same index, return `"none"`. Otherwise, return the substring between the end of the first `"bread"` and the start of the last `"bread"`.
- **Exercise #5.3 Calculate Net Income**:  
  Traverse the string from right to left. When a digit is encountered, build the number (tracking place value with `power`). When a minus sign `'-'` is found, negate the collected number and add it to the total. For any other non‑digit, flush the current number to the total (if any) and reset. After the loop, add any remaining number. Positive numbers represent income, negative numbers expenses.
- **Exercise #5.4 A Diamond is FORever**:  
  For an odd `n`, generate only the top half (including the middle row) as an array of strings. Each row is built by iterating over columns, inserting a dot `'.'` or star `'*'` with a space between each symbol. The condition for a star is that the column index (in a 2×n‑1 step where every other character is a space) falls within the diamond shape: `j >= n-1-2*i` and `j <= n+2*i` for row `i`. Then print the top half rows followed by the bottom half in reverse order (excluding the middle row when mirroring).
- **Exercise #5.5 Even Odd Swap**:  
  Record the indices of all odd and even numbers in two separate arrays. Since the array contains the same number of evens and odds, iterate through the index pairs in order and swap the element at the odd index with the element at the even index. Return the modified array.
- **Exercise #5.6 Two Swappable**:  
  For length‑5 strings, swapping is allowed only between indices that differ by 2 (i.e., indices of the same parity: 0↔2↔4 and 1↔3). Therefore, the multiset of characters at even positions must be the same in both strings, and the same for odd positions. Check that overall character counts match, then check separately the parity‑grouped counts using arrays of size 26.
- **CW1 #5.1 Reverse Numbers**:  
  First, scan the string to count digit characters and record their positions and numeric values. Then construct the result by iterating through the original string: if the current index is a digit position, place the reversed digit from the stored array; otherwise, copy the original character unchanged. This reverses the sequence of digits while preserving all non‑digit characters in place.
## Notes

- Each task is implemented as a separate class.
