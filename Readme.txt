Assignment# 9
===========================================================================

Statement of Work:
Write a generic class MyMathClass with at type parameter T where T is a numeric object 
(Integer, Double or any class that extends java.lang.number)  
Add a method standardDeviation (stdev) that takes an ArrayList of type T and returns a standard deviation 
as type double. 
Use a for each loop where appropriate.

Hard code a couple of test arrays into your Demo file.  
You must use at least 2 different types such as Double and Integer.

Your call will be something like:

System.out.println(“Standard Deviation 0-9 “ + MyMathClass.stdev(a));

Your class and method headers will be:

public class MyMathClass<T extends Number> {
	public static <T extends Number> double stdev(ArrayList<T> a){

Research java’s Number class to see what useful method we are gaining access to.



==========================================================================

Research:
Need to better understand Standard Deviation
Used: https://www.mathsisfun.com/data/standard-deviation-formulas.html
Realized the assignment is based on SAMPLE Standard Deviation rather than POPULATION Standard Deviation.

Square a number with Math.pow
https://www.tutorialspoint.com/java/lang/math_pow.htm

Square Root with Math.sqrt
https://www.tutorialspoint.com/java/lang/math_sqrt.htm

--------------------------------------------------------------------------

Pseudocode:
MyMathClass.java
MMCDemo.java

Construct formulas based on MathisFun Sample Deviation Website

Test against Ken Moore code to validate





