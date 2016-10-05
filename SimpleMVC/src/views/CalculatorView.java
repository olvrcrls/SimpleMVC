/*
 * 
 * It is here we will initialize our main method.
 * The View is the only that is visible to the user. The View does not know about the controller and model
 * it only receives, passes, and displays data from and to the model.
 * 
 * Simply, the View is the UI of the application and is responsible for user interactions.
 * 
 */

package views;
import java.util.Scanner;
import models.CalculatorModel;
public class CalculatorView {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in); // lets the user input data
		CalculatorModel problem = new CalculatorModel(); // using the first constructor
		double firstValue = 0.00;
		double secondValue = 0.00;
		String operation;
		
		System.out.print("Please input your first value: ");
		firstValue = scan.nextDouble();
		System.out.print("Please input your second value: ");
		secondValue = scan.nextDouble();
		System.out.print("Please input your operation ( +, -, *, / ): ");
		operation = scan.next();
		problem.setFirstValue(firstValue);
		problem.setSecondValue(secondValue);
		problem.setOperation(operation);
		problem.calculate();
		System.out.println("User's input are : " + firstValue + " as the first value \nand " + secondValue + " as the second value. \nThe result is " + problem.getResult() + "\n\n");
		System.out.println("Using the constructor Model(firstVal, secondVal, operation): ");
		System.out.println("Initialize first value as 5 \n and second value as 10 and \n opereation as '*'");
		CalculatorModel sample = new CalculatorModel(5,10,"*"); 
		System.out.println("and the result is: " + sample.getResult());
	} // initializing the main
}
