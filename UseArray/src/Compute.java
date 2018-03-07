/**
 * Author:	Sam Cooney
 * Project:	UseArray
 * Date:	Nov 8, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.text.DecimalFormat;	// Import DecimalFormat class.

public class Compute {	// Begin class Compute.
	double sum, classAverage;						// Declare global variables.
	DecimalFormat fmt = new DecimalFormat("0.00");	// Instantiate object of class DecimalFormat.
	
	public Compute() {	// Constructor.
		
		sum = 0;			// Set global to 0.
		classAverage = 0;	// Set global to 0.
	}	// End constructor.
	
	public double aver(double[] aarray, int anumb) {	// Begin aver method.
		
		sum = 0;
		for(double num:aarray) {	// For loop for computing the sum.
			
			sum += num;				// Sum of all values in aarray.
		}
		
		classAverage = sum/anumb;	// Compute average of the class.
		
		return sum;	// Returns sum.
	}	// End aver method.
	
	public void setter(double[] aarray, int index, double value) {	// Begin setter method.
		
		aarray[index] = value;	// Set array value.
	}	// End setter method.
	
	public double getter(double[] aarray, int index) {	// Begin getter method.
		
		double value = aarray[index];	// Get array value.
		
		return value;	// Return value.
	}	// End getter method.
	
	public String toString() {	// Begin toString method.
		
		String average = "The class average is " + fmt.format(classAverage) + ".";
		
		return average;	// Return string value.
	}	// End toString method.

}	// End Compute.
