/*
 * Name: Joey Solak
 * Date: 11/23/16
 * Class: CIT-130
 * Purpose Of The File: Hard code a couple of test arrays into your Demo file.  
 * You must use at least 2 different types such as Double and Integer.
 */
package mymathclass;

import java.util.ArrayList;

/**
 *
 * @author Joey Solak
 */
public class MMCDemo {
    
    public static void main(String args[]){
      
        double stdDev = 0;
		
		ArrayList<Double> doubArrayList = new ArrayList<Double>();
		doubArrayList.add(new Double(1));
		doubArrayList.add(new Double(2));
		doubArrayList.add(new Double(3));

		
		MyMathClass<Double> myDouble = new MyMathClass<Double>();
		stdDev = myDouble.stdev(doubArrayList);
		System.out.println("The standard deviation of the Double ArrayList is " + stdDev);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(new Integer(1));
		intArrayList.add(new Integer(2));
		intArrayList.add(new Integer(3));

		
		MyMathClass<Integer> myInteger = new MyMathClass<Integer>();
		stdDev = myInteger.stdev(intArrayList);
		System.out.println("The standard deviation of the Integer ArrayList is " + stdDev);
		

		
       
        
        
    }
    
}
