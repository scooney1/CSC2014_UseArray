/**
 * Author:	Sam Cooney
 * Project:	UseArray
 * Date:	Nov 8, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;		// Import Scanner class.
import java.text.DecimalFormat;	// Import DecimalFormat class.

public class UseArray {

	public static void main(String[] args) {	// Begin main.
		Box myBox = new Box(13);						// Instantiate object of class Box.
		Compute myCompute = new Compute();				// Instantiate object of class Compute.
		Scanner scan = new Scanner(System.in);			// Instantiate object of class Scanner.
		DecimalFormat fmt = new DecimalFormat("0.00");	// Instantiate object of class DecimalFormat.
		int SIZE = 10;									// Declare size.
		String[] names = new String[SIZE];				// Declare string array.
		double[] grades = new double[SIZE];				// Declare double array.
		
		System.out.println("Please enter one name, then press enter.");
		System.out.println("Follow this by his/her grade, then press enter.");
		System.out.println("Follow this by a second name, etc. For up to 10 people.");
		for(int i=0;i<SIZE;i++) {	// For loop for reading in values.
			
			names[i] = scan.nextLine();		// Read in string value.
			grades[i] = scan.nextDouble();	// Read in double value.
			scan.nextLine();				// Skip a line.
		}
		
		double usum = myCompute.aver(grades, SIZE);	// Call aver method.
		for(int i=0;i<SIZE;i++) {	// For loop for printing out array values.
			
			System.out.println(names[i] + "\t\t" + grades[i]);
		}
		System.out.println();
		System.out.println("The sum of all the grades is: " + fmt.format(usum));
		System.out.println();
		System.out.println(myCompute);
		System.out.println();
		System.out.println(myBox);
		System.out.println();
		
		System.out.println("Choose an index to change and the grade value to replace it with.");
		int index = scan.nextInt();			// Read in index value.
		scan.nextLine();
		double value = scan.nextDouble();	// Read in grade value.
		scan.nextLine();
		myCompute.setter(grades, index, value);	// Call setter method.
		usum = myCompute.aver(grades, SIZE);	// Call aver method.
		for(int i=0;i<SIZE;i++) {	// For loop for printing out array values.
			
			System.out.println(names[i] + "\t\t" + grades[i]);
		}
		System.out.println();
		System.out.println("The sum of all the grades is: " + fmt.format(usum));
		System.out.println();
		System.out.println(myCompute);
		System.out.println();
		System.out.println("Choose an index value to view.");
		index = scan.nextInt();						// Read in index value.
		value = myCompute.getter(grades, index);	// Call getter method.
		System.out.println("The value at index " + index + " is: " + value);
		
		scan.close();	// Close scanner.
	}	// End main.

}
