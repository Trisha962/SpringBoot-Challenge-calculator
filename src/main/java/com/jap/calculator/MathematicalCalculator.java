

package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		int addition= num1+num2;
		return addition;
	}
	public int subtract(int num1, int num2)
	{
		int subtract= num1-num2;
		return subtract;
	}
	public int multiply(int num1, int num2)
	{
		int multiply= num1*num2;
		return multiply;
	}
	public int divide(int num1, int num2)throws ArithmeticException
	{
		int div= 0;
		try {

			//write logic
			div = (num1 / num2);
			//Handle specific exception
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return div;

	}
	public int modulo(int num1, int num2)
	{
		int moduloo= num1%num2;
		return moduloo;
	}
}
