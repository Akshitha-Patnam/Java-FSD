package com.voter;

public class AgeValidater 
{
	public void checkAge(int age)throws ValidAgeException, InvalidAgeException
	{
		if(age >= 18)
		{
			ValidAgeException ve = new ValidAgeException("eligible");
			
			throw(ve);
		}
		else
		{
			InvalidAgeException ie = new InvalidAgeException("not eligible");
			
			throw(ie);
		}
	}
}
/*
 * 1. create maven project
 * 2. add dependencies
 * 3. src/main/java/ POJO 
 * 4. src/test/java TestLogic for
 * 5. collection type test cases
 * 6. exceptions test cases
 */
