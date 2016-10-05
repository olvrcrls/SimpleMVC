/*
 *  The Models mostly concerned about the data handling that is processed by the controllers
 *  usually it is where the data are stored, updated, or even removed in the database.
 *  Since the example does not concern database connection, this will only present
 *  a basic interaction of controllers and models
 *  
 */
package models;
/*
 * I have included many methods because there are a lot of ways to improved or show
 * each programmers or developers' ways of utilizing the controller with the model
 * 
 */


import controllers.CalculatorController; // lets import the logic of the a basic calculator
public class CalculatorModel {
	protected double first = 0.00; //initializing the container of the first value;
	protected double second = 0.00; // initializing the container of the second value;
	protected double result = 0.00; // initializing the container of the result value
	protected String operation = "+"; // what operation will be used. symbol is used here. by default it is add.
	protected CalculatorController calculator = new CalculatorController();
	
	public CalculatorModel()
	{
		
	}
	
	public CalculatorModel(double first, double second)
	{
		this.first = first; // this is the same as setFirstValue(this.first);
		this.second = second; // this is the same as setSecondValue(this.second);
		
	} // a constructor of the class for setting the 2 values
	
	public CalculatorModel(double first, double second, String operation)
	{
		this.first = first;
		this.second = second;
		this.operation = operation;
		
		switch(operation)
		{
			case "+": result = calculator.add(this.first, this.second); break;
			case "-": result = calculator.subtract(this.first, this.second); break;
			case "*": result = calculator.multiply(this.first, this.second); break;
			case "/": result = calculator.divide(this.first, this.second); break;
			default: System.out.println("Invalid operation symbol."); break;
		}
	} // a constructor of the class for setting the 2 values then calculates the result straight forwardly
	
	// either way you can create a set methods for each data. but this will be more time consuming...
	
	public void calculate()
	{
		switch(operation)
		{
			case "+": result = calculator.add(getFirstValue(), getSecondValue()); break;
			case "-": result = calculator.subtract(getFirstValue(), getSecondValue()); break;
			case "*": result = calculator.multiply(getFirstValue(), getSecondValue()); break;
			case "/": result = calculator.divide(getFirstValue(), getSecondValue()); break;
			default: System.out.println("Invalid operation symbol."); break;
		}
	} // this will calculate only the value and store it to the `result` variable
	
	
	
	// following methods can be understood as to refer to the syntax and variable name
	// this uses the controllers or the calculator's logic
	public void add()
	{
		result = calculator.add(getFirstValue(), getSecondValue());
	}
	
	
	public void subtract()
	{
		result = calculator.subtract(getFirstValue(), getSecondValue());
	}
	
	public void multiply()
	{
		result = calculator.multiply(getFirstValue(), getSecondValue());
	}
	
	public void divide()
	{
		result = calculator.divide(getFirstValue(), getSecondValue());
	}
	
	// --
	
	public void setFirstValue(double val)
	{
		first = val;
	}
	
	public void setSecondValue(double val)
	{
		second = val;
	}
	
	public void setOperation(String symbol)
	{
		operation = symbol;
	} // this will set the operation
	
	public double getFirstValue()
	{
		return first;
	} // this will return the `first` variable's value
	
	public double getSecondValue()
	{
		return second;
	} // this will return the `second` variable's value
	
	public String getOperation()
	{
		return operation;
	}
	
	public double getResult()
	{
		return result;
	} // this will return the `result` variable's value
	
}
