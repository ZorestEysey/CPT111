# Week 2: Data Types, Math, Client Input, Debugging
## File Structure
- `PolarCoordinates.java` - Lab Exercise #2.1 Polar Coordinates
- `CMYKtoRGB.java` - Lab 2 Challenge - CMYK to RGB
- `DateToDay.java` - Exercise #2.1 What day is it?
- `GreatCircleDistance.java` - Exercise #2.2 Great Circle Distance
- `AreaOfAPentagon.java` - Exercise #2.3 Area of a Pentagon
- `YIQtoRGB.java` - CW1 #2.1 YIQ to RGB
## Tasks
### Lab Exercise #2.1 Polar Coordinates
Write a Java program that converts Cartesian coordinates to Polar coordinates.  
Your program should take two real input numbers `x` and `y`, and print the Polar coordinates `r` and `theta` according to the formulas below.
Note that you should use the Java method `Math.atan2(y, x)`, which can compute the arctangent value of `y/x`  in all quadrants.  
Test case 1:  
Input:  
```
3.0  
4.0  
```
Output:  
```
r = 5.0  
theta = 0.9272952180016122
```

Test case 2:  
Input:  
```
1.0  
1.0  
```
Output:  
```
r = 1.4142135623730951  
theta = 0.7853981633974483
```

### Lab 2 Challenge - CMYK to RGB
There are several different formats used to represent color.  
You may have known the _RGB format_ that specifies the level of red (R), green (G), and blue (B) on an _integer_ scale from 0 to 255.  
There is another format called the _CMYK format_ that specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a _real_ scale from 0.0 to 1.0.
Write a Java program that converts from CMYK format to RGB format using the following formulas:  
white = 1 − black  
red = 255 × white × (1 − cyan)  
green = 255 × white × (1 − magenta)  
blue = 255 × white × (1 − yellow)

Your program must take four **double** input numbers cyan, magenta, yellow, and black;  
compute the corresponding RGB values, each _rounded to the nearest integer_;   
and print the RGB values as in the test cases below:

Test case 1:  
Input:    
```
0.0  
0.0  
1.0  
0.0
```
Output: 
```
red = 255  
green = 255  
blue = 0
```
Test case 2:  
Input:  
```
0.0  
1.0  
0.75  
0.50 
``` 
Output:  
```
red = 128  
green = 0  
blue = 32
```
### Exercise #2.1 What day is it?
Write a Java program that takes a date as input and prints the day of the week that date falls on.

Your program should take three integers: y (year), m (month), and d (date).  
For m use 1 for January, 2 for February, and so on.  
For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on.

Use the following formulas:  

$$a=y-(14-m)/12$$

$$b=a+a/4-a/100+a/400$$

$$c=m+12\times((14-m)/12)-2$$

$$day=(d+b+(31\times c)/12)\quad mod\:7$$  

Test case 1:  
Input:  
```
2018  
12  
24
```
Output:   
`It's day 1 !`

### Exercise #2.2 Great Circle Distance
The _great-circle distance_ is the length of the shortest path between two points  (x1,y1)  and  (x2,y2)  on the surface of a sphere. 

The formula is given below.  

$$dist=2r\arcsin{(\sqrt{\sin^2(\frac{x_2-x_1}{2})+\cos x_1\cos x_2\sin^2(\frac{y_2-y_1}{2})})}$$  
Write a Java program that takes four double input numbers x1, y1, x2, y2, which are the latitude and longitude in degrees of two points on the surface of the Earth;  
uses the mean radius of the Earth 

_r  =  6,371.0_   kilometres;  
and prints the great-circle distance _dist_ between them in kilometres.  
  
Note that the input numbers are given in degrees but Java’s trigonometric functions use radians. Use Math.toRadians() to convert from degrees to radians.

Test case 1:  
Input:  
```
80.0  
25.0  
155.0  
102.5  
```
Output:   
`7509.440708014122 kilometres`

Test case 2:  
Input:  
```
10.55  
39.33  
21.47  
-7.88 
``` 
Output:  
`5169.256612492542 kilometres`

### Exercise #2.3 Area of a Pentagon
Write a Java program that computes the area of a pentagon, given _r_ = the length from the center of a pentagon to a vertex (a real number). The formula of computing the area of a pentagon is:  

$$Area=\frac{5\times s^2}{4\times\tan(\frac{\pi}{5})}$$

where s is the length of a side, computed with the formula:  

$$s=2r\sin\frac{\pi}{5}$$

  
Test case 1:  
Input:  
`2.5`  
Output:   
`Area = 14.86025806711178`

Test case 2:  
Input:  
`1.0`  
Output:  
`Area = 2.377641290737884`

### CW1 #2.1 YIQ to RGB
There are several different formats used to represent color. You may have known the _RGB format_ that specifies the level of red (R), green (G), and blue (B) on an _**integer**_ scale from 0 to 255. You have learned about CMYK format in Lab 2.

There is another format called the **YIQ** that is used in analog TV broadcasting. It specifies the luminance (Y), in-phase (I), and quadrature (Q) on a _**real**_ scale from with 0.0 ≤ Y ≤ 1.0, –0.5957 ≤ I ≤ 0.5957, and –0.5226 ≤ Q ≤ 0.5226.
Write a Java program that converts from YIQ format to RGB format using the following steps.

**Step 1:**  
Compute the values of R, G, B in double using the following formula:

$$R=(Y+0.956I+0.619Q)255$$  
 $$G=(Y-0.272I-0.647Q)255$$  
$$B=(Y-1.106I+1.703Q)255$$

**Step 2:** Round the double values to the nearest int values.  
  
**Step 3:**   
Using Math.min function, make sure that the _largest_ possible resulting value is 255; and using Math.max function, make sure that the _smallest_ possible resulting value is 0.  
  
Your program must take three **double** input numbers Y, I, and Q; compute the corresponding RGB values, and print the RGB values as in the test cases below:

Test case 1:  
Input:    
```
0.5  
0.5  
0.5  
```
Output:
```
red = 255  
green = 10  
blue = 204
```

Test case 2:  
Input:  
```
0.0  
0.25  
-0.50  
```
Output:  
```
red = 0  
green = 65  
blue = 0
```
## Approach

- **Polar Coordinates**:  
  Use `Math.sqrt(x * x + y * y)` to compute the radius `r`, and `Math.atan2(y, x)` to compute the angle `theta` in radians.

- **CMYK to RGB**:  
  Convert CMYK to RGB using the intermediate variable `white = 1 - black`, then compute each color channel and round the results using `Math.round()`.

- **Date Calculation**:  
  Apply the given integer-based formulas step by step to compute the day index, using integer division and modulo operation (`% 7`).

- **Great Circle Distance**:  
  Use trigonometric functions (`Math.sin`, `Math.cos`, `Math.asin`) to compute the distance, and convert input values from degrees to radians using `Math.toRadians()`.

- **Area of a Pentagon**:  
  First compute the side length `s` using trigonometric functions, then calculate the area using the given formula with `Math.sin` and `Math.tan`.

- **YIQ to RGB**:  
  Compute RGB values using linear transformation formulas, round them to integers, and clamp the results to the range `[0, 255]` using `Math.min` and `Math.max`.
## Notes
- Each task is implemented as a separate class.
