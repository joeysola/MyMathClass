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
      
        //Declare Variables
        double stdDeviation;
        

        //CODE FROM KEN MOORE ASSIGNMENT 9 FOR TESTING
        System.out.println("Code from Ken Moore Assignment 9 for testing:");
        double [] d = new double[10];
        for(int i = 1; i <=10; i++)
        	d[i-1]=i;
        
        double total = 0;
        double average = 0;
        
        for(int i = 0; i < 10; i++)
        	total += d[i];
        average = total/10;
        System.out.println("average "+average);
        total = 0;
        for(int i = 0; i < 10; i++)
        	total += (d[i] - average)*(d[i]-average);
        total /= 9;
        
        double std = Math.sqrt(total);
        System.out.println("Stdev = " + std);
        //END KEN MOORE CODE
        
        //Intro to Demo
        System.out.println("MYTEST:");
        System.out.println("If the input is 1 thru 10");

	//Setup Double Array
        ArrayList<Double> dList = new ArrayList<Double>();
        for (int i = 1; i <= 10; i++){
          dList.add(new Double(i));  
        }
        
        //Initiate MyMathClass<Double>
        MyMathClass<Double> myDbl = new MyMathClass<Double>();
        stdDeviation = myDbl.stdev(dList);
        System.out.println("Standard deviation for numbers 1-10 type Double: " + stdDeviation);

        //Setup Integer Array
        ArrayList<Integer> iList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++){
          iList.add(new Integer(i));  
        }

        //Initiate MyMathClass<Integer>  
        MyMathClass<Integer> myInt = new MyMathClass<Integer>();
        stdDeviation = myInt.stdev(iList);
        System.out.println("Standard deviation for numbers 1-10 type Integer: " + stdDeviation);
		
   
    }
    
}
