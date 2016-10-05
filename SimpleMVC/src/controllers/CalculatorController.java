/*
 * The role of Controllers is contain or define the business rules / business logics
 * for this case it contains the basic logics of a basic calculator
 * 
 */
package controllers;

public class CalculatorController {

	public double add(double first, double sec)
	{
		return (first + sec);
	}
	
	public double subtract(double first, double sec)
	{
		return (first - sec);
	}
	
	public double multiply(double first, double sec)
	{
		return (first * sec);
	}
	
	public double divide(double first, double sec)
	{
		try
		{
			return (first / sec);
		}
		catch(Exception err)
		{
			System.out.println("Your second value or denominator must not be equal to 0 or any invalid digits.");
		}
		return 0.00;
	}
}
