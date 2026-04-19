# Week 4: Arrays, For Loops, Static Methods 1
## File Structure
- `maxConsecutiveSum.java` - Exercise #4.1 Integer Frequency
- `sumOfProper.java` - Lab 4 Challenge - Sum of Proper Elements
- `maxProduct.java` - CW1 #4.1 Max Product
## Tasks
### Exercise #4.1 Integer Frequency
Write a Java function/static method `getFrequency(int[] input, int num)` that takes as parameter an array of integers `input` and an integer num and returns the _frequency_ of appearances of num in the array input.

For example, if `input = [1, 2, 1]` and `num = 1`, the function should return `2`. And if `num = 2`, the function should return `1`.
### Lab Exercise #4.1 Max Consecutive Sum
You are given an array of integers that contains positive, zero, or negative numbers. Your task is to write a static method that finds the **maximum sum** of a sequence of **consecutive elements** in the array and returns this sum.

Write a Java method int `maxConsecutiveSum(int[] arr)` that given an integer array returns the sum of its consecutive elements.
Test cases :  
`maxConsecutiveSum([-3, 5, -2, 3, -1]) → 6`  (the sum of consecutive elements 5 + -2 + 3 = 6 is max)  

`maxConsecutiveSum([1, -1]) → 1`
### Lab 4 Challenge - Sum of Proper Elements
We say that an element of an integer array is **proper** if and only if it is some multiple of (its index + 1).
Write a Java method `int sumOfProper(int[] nums)` that given an integer array returns the sum of all its proper elements.  
  

Test cases :  
`sumOfProper([1, 2, 6]) → 9`  (from 1 + 2 + 6, since all elements are proper)  

`sumOfProper([10, 25]) → 10`  (since only 10 is a proper element)
### CW1 #4.1 Max Product
Write a static method int maxProduct(int[] arr) that takes an integer array arr as input and returns the **maximum product** of two elements in the array. If the array contains _less than two_ elements, returns 0.
Test cases :  
`maxProduct([-10, 5, -2, 1, 6]) → 30`  (the two numbers 5 and 6 give max product 5 * 6 = 30)  

`maxProduct([-1, 2]) → -2`

`maxProduct([1]) → 0`

Add more test cases, and use this opportunity to practice your testing skills!  
Optional challenge: can you do it with one loop only?

## Approach
- **Exercise #4.1 Integer Frequency**: Use for loop to check all the elements in the array and determine if the element equals to `num`. If so, add `fre` by 1.
- **Lab Exercise #4.1 Max Consecutive Sum**: Determine if the given `arr` is a meaningful array, if not, return 0. Otherwise, set the initial value of sum and maximum sum as the first element of `arr`. By using for loop, check if the sum is positive, if so, set `sum + arr[i]` as new `sum`, `sum = arr[i]` otherwise. Use `maxsum=Math.max(maxsum, sum)` to store the maximum value of `sum`.
- **Lab 4 Challenge - Sum of Proper Elements**: Set the initial value of `sum` as 0. Use for loop and if statement to determine if the element is some multiple of `index+1`, if so, add `sum` by the element.
- **CW1 #4.1 Max Product**: The maximum production maybe produced by two numbers with the same symbol and larger absolute values. Therefore, find the largest two numbers and the least two numbers. Initialize them by the first elements with correct correspondence, then use for loop and if statement to update the four extreme values. Eventually, compare the productions `max1 * max2` and `min1 * min2`, return the larger one.
## Notes 

- Each task is implemented as a separate class.
