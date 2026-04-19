# Week 3: Control Flow
## File Structure
- `HarmonicNumber.java` - Exercise #3.1 Harmonic Numbers
- `BlackJack.java` - Exercise #3.2 Black Jack
- `PandemicSpread.java` - Exercise #3.3 Pandemic Spread
- `RightTriangle.java` - Exercise #3.4 Right Triangle
- `Armstrong.java` - Lab Exercise #3.1 Armstrong Number
- `HailStone.java` - Lab 3 Challenge - Hailstone Sequence Length
- `PerfectNumber.java` - CW1 #3.1 Perfect Number
## Tasks
### Exercise #3.1 Harmonic Numbers
**Harmonic numbers** are a sequence of numbers that arises in various fields of mathematics.  
The _n_-th harmonic number, denoted as _Hn_, is defined as the sum of the reciprocals of the first _n_ natural numbers:

$$H_n=1+\frac{1}{2}+\frac{1}{3}+\cdots+\frac{1}{n}=\sum^n_{k=1}\frac{1}{k}$$

Write a Java program _HarmonicNumber_ that on input a positive integer _n_, prints the _n_ -th harmonic number.  
Test case 1:  
Input:  
`2`  
Output:  
`1.5`  
  
Test case 2:  
Input:  
`10`  
Output:  
`2.9289682539682538`  
### Exercise #3.2 Black Jack
In Black Jack card game, we call a value _busts_ if it exceeds a sum of 21.  
Write a Java program _BlackJack_ that on input 2 integer values greater than 0, prints a single integer of whichever value is nearest to 21 without going bust.  
Print -1 if both values bust.  
Test case 1:  
Input:  
20  
19  
Output:  
20

Test case 2:  
19  
22  
Output:  
19

Test case 3:  
Input:  
22  
23  
Output:  
-1
### Exercise #3.3 Pandemic Spread
Write a Java program _PandemicSpread_  to simulate how _fast_ a pandemic spread with the following input:  
- `init` : the initial number of infected persons on day 1
- `numInfect` : the average number of healthy people that one infected person newly infects per day
- `population` : the total number of people in the area  
Return the day on which the _entire_ population will be infected.

Test case 1 :  
Input:  
1  
2  
10  
Output:  
4  
(Explanation: Total Infected Day 1 = 1; Day 2 = 3; Day 3 = 9; Day 4 = 27)
  
Test case 2:  
Input:  
5  
3  
1000  
Output:  
5
### Exercise #3.4 Right Triangle
Write a Java program RightTriangle that takes three integer input numbers and determines whether they make up the side lengths of a right triangle.  
Your program must print output true if and only if the following two conditions are true:  
1) All three integers are positive (greater than zero).  
2) You can find two integers where the sum of the squares of those two integers is equal to the square of the third integer.  

Test cases 1:  
Input:  
5  
12  
13  
Output:  
true  
(since they are all positive and 52  + 122 == 132)  

Test cases 2:  
Input:  
5  
4  
3  
Output:  
true  
(since they are all positive and 42 + 32 == 52 )  

Test cases 3:  
Input:  
-3  
-4  
5  
Output:  
false  
(since -3 and -4 are not positive)
### Lab Exercise #3.1 Armstrong Number
An Armstrong number is an _n_-digit number that equals the sum of the _n_th power of its digits.  
For example,  

- 153 is a three-digit number where the sum of the cubes of the individual digits equal 153
- 1634 is a four-digit number where the sum of the 4th power of the individual digits equal 1634

$$153=(1)^3+(5)^3+(3)^3$$

$$1634=(1)^4+(6)^4+(3)^4+(4)^4$$

Write a Java program _Armstrong_ that on input two positive integers _a_ and _k_, prints the first _k_ Armstrong numbers greater than or equal to _a_.  
  
Test case 1:  
Input:  
100  
2  
Output:  
153  
370  
  
Test case 2:  
Input:  
1500  
1  
Output:  
1634
### Lab 3 Challenge - Hailstone Sequence Length
The _Hailstone sequence_ is computed as follows:  

- Start with an integer number n
- If n is even, the next number in the sequence is n/2
- If n is odd, the next number is 3n+1  
    
- Continue until it reaches 1

For example,  
for n = 3,  the sequence is 3, 10, 5, 16, 8, 4, 2, 1  
and for n = 12,  the sequence is 12, 6, 3, 10, 5, 16, 8, 4, 2, 1
Write a Java program _HailStone_ that on input a positive integer n, prints the _**length**_ of the Hailstone sequence starting at n.  
  

Test case 1:  
Input:  
3  
Output:  
8  
  
Test case 2:  
Input:  
12  
Output:  
10  
  
Note that, interestingly, we still do _not_  know whether the Hailstone sequence will ever reaches 1 for all starting n !

This is also known in the literature as the _Collatz conjecture_.
### CW1 #3.1 Perfect Number
A positive integer n is called **a perfect number** if it is equal to the sum of its _proper factors_ (i.e. its factors/divisors excluding itself). For example, the number 28 is perfect because its proper factors are 1, 2, 4, 7, and 14, and 1 + 2 + 4 + 7 + 14 = 28. In contrast, 20 is not perfect since its proper factors are 1, 2, 4, 5, 10 and 1 + 2 + 4 + 5 + 10 = 22, not 20.

Write a Java program that takes an integer n, prints true if n is a perfect number, and prints false otherwise.

Note: you may assume that the integer n is positive.
## Approach
- **Exercise #3.1 Harmonic Numbers**: Use if statement to judge whether the input is a positive number. Use while loop to add each element of the polynomial.
- **Exercise #3.2 Black Jack**: When `card1` and `card2` are both less or equal to 21, print the greater one. If only one of them exceed 21, print the smaller one. If both of them are greater than 21, print -1.
- **Exercise #3.3 Pandemic Spread**: The amount of infected people on the first day could be calculated by: `infected = init * numInfect`, use while loop to determine if `infected > population`. If true, break the loop and print the current `day`, else add one day. The initial value of `day` is 1.
- **Exercise #3.4 Right Triangle**: For three integers, if the square of one of them could be expressed by the sum of the other two integers' square, print true, else print false. Use if statement to decide which to print, for three integers, there are three conditions to decide according to the discription of condition above. Print true if either of the three conditions is true.
- **Lab Exercise #3.1 Armstrong Number**: Use `numb` as a counter, when `numb < k`, find the next Armstrong number until `numb == k`. Check if `a` is an Armstrong number, if not, add `a` by 1. To determine if `a` is an Armstrong number, `digit` finds the amount of digit of `a` by using a while loop, `ele` stores every number on each digit of `a`. `Armstrong` is the sum of the `ele` of power `digit`. If `Armstrong == a`, `a` is an Armstrong number, add `numb` by 1.
- **Lab 3 Challenge - Hailstone Sequence Length**: Determine if input `n` is a positive number, if not, print "Error.". Otherwise, use while loop to repeat the given calculation until the last element of the sequence is 1. The initial value of `numb` is 1, add `numb` by 1 after each while loop completes.
- **CW1 #3.1 Perfect Number**: Use while loop and if statement to determine if the number is a factor of `n`, and find the sum of all the factors, then use if statement to determine if the sum of factors equals to `n`, if so, print true, print false otherwise. If the inputted `n` is a negative number, print "Error.".
## Notes
- Each task is implemented as a separate class.
