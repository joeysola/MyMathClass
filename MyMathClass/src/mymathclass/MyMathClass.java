/*
 * Name: Joey Solak
 * Date: 11/23/16
 * Class: CIT-130
 * Purpose Of The File: Write a generic class MyMathClass with at type parameter T where T is a numeric object 
 *(Integer, Double or any class that extends java.lang.number)  
 * Add a method standardDeviation (stdev) that takes an ArrayList of type T and returns a standard deviation as type double. 
 * Use a for each loop where appropriate.
 */
package mymathclass;

import java.util.ArrayList;

/**
 *
 * @author Joey Solak
 */
public class MyMathClass<T extends Number> {
        

	public static <T extends Number> double stdev(ArrayList<T> a){
		
            //Declare Variables
            double avg = 0; //Average
            double stdDev = 0; //Standard Deviation
            
            //Work out the Average
            //Add all the numbers in the Array
            for (T element : a){
		avg = (avg + element.doubleValue()); //doubleValue()Returns the value of the specified number as a double.
		}
            //Divide by the size of the array to get your average
		avg = (avg / a.size()); 
            
            //For each number in the array subtract the Average and square the result.
		for (T element : a){
		stdDev = (stdDev + Math.pow((element.doubleValue() - avg), 2));
		}
		
            //Work out the average of the squared differences
                stdDev = (stdDev / a.size());
		
            
                
		stdDev = Math.sqrt(stdDev);
                
                
                return stdDev;
	}

    
    
    
    
    
}
