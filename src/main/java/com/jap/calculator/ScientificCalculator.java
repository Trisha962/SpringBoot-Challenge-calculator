
package com.jap.calculator;
import java.lang.Math;
public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if(num<=0)
		{
			throw new CalculatorException("Ceil value not possible");
		}
		else {
			Math.ceil(num);
		}
		return num;
	}
	
	public  double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if(num<=0)
		{
			throw new CalculatorException("Floor value not possible");
		}
		else
		{
			Math.floor(2000);
		}
		return num;
	}
	
    public  long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if(num1<=0 && num2<=0)
		{
			throw new CalculatorException("Power not possible");
		}
		else
		{
			Math.pow(100,1);

		}
		return power(100,1);
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call sqrt method of Math class and return the value
		if(num<=0)
		{
			throw new CalculatorException("Not Possible Mathematically");
		}
		else
		{
			Math.sqrt(num);
		}
		return num;
    }

	public static void main(String[] args)throws Exception{
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
		} catch (CalculatorException e)
		{
			throw new RuntimeException(e);
		}
		try{
			scientificCalculator.squareRoot(25);
		}
		catch(CalculatorException e)
		{
			throw new RuntimeException(e);
		}
		try {
			scientificCalculator.power(100,1);
		}
		catch (CalculatorException e)
		{
			throw new RuntimeException(e);
		}
		try
		{
			scientificCalculator.floorOfANumber(400);
		}
		catch (CalculatorException e)
		{
			throw new RuntimeException(e);
		}

}
}
