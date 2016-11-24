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
        

        //Code from Ken Moore Assignment 9 for testing
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
        System.out.println("Current Total: " + total);
        double std = Math.sqrt(total);
        System.out.println("Stdev = " + std);
    
        
        //Intro to Demo
        System.out.println("My Test: If the input is 1 thru 10");


	//Setup Double Array
        total = 0;
        ArrayList<Double> dList = new ArrayList<Double>();
        for (int i = 1; i <= 10; i++){
          dList.add(new Double(i));  
        }
        
       for (Double e : dList){
           System.out.print(e + " ");
           total += e;
           System.out.println("Current total: " + total);
           
       }
        
       total = total / 10;
       System.out.println("AVERAGE: " + total);
       average = total;
       total = 0;
       for (Double e : dList){
           total += (e - average)*(e -  average);
       }
       System.out.println("Current total: " + total);
       total /= 10;
       System.out.println("Current total: " + total);
       std = 0;
       std = Math.sqrt(total);
       System.out.println("Current total: " + std);
       
	
        MyMathClass<Double> myDouble = new MyMathClass<Double>();
        stdDeviation = myDouble.stdev(dList);
        System.out.println("Standard deviation for numbers 0-9 type Double: " + stdDeviation);

        ArrayList<Integer> iList = new ArrayList<Integer>();
        iList.add(new Integer(1));
        iList.add(new Integer(2));
        iList.add(new Integer(3));


        MyMathClass<Integer> myInteger = new MyMathClass<Integer>();
        stdDeviation = myInteger.stdev(iList);
        System.out.println("Standard deviation for numbers 1-10(array index 0-9) type Integer: " + stdDeviation);
		

		
       
        
        
    }
    
}
