package com.arrys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp1 {
	
	public static void main(String[] args) {
		
		Pattern formatD = Pattern.compile(".s");
		
		Matcher matchD = formatD.matcher("bdgx");
		
		boolean b = matchD.matches();
		
		System.out.println(b);
		
		boolean b1 = Pattern.compile(".s").matcher("dada").matches();
		
		boolean b2 = Pattern.matches("..s", "abs");
		
		System.out.println(b2);
		
		System.out.println(Pattern.matches("[a-z]", "jkl"));
		
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "jkl"));
		
		
		
		
	}
	
	public boolean validEmail(String email)
	{
		boolean validateEamil = Pattern.matches(
				
				"[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*", email);
		
		return validateEamil;
	}
	
	public boolean validDatePassword(String password)
	{
		
		String patternP = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&%!])(?=\\S+$).{12,}";
		
		boolean passwordValidate = 
				
				Pattern.matches(patternP,password);
		return passwordValidate;
	}
}

/*
 *1. Reverse a array and find max and mini value? 
 *2. From array all even numbers left side and odd numbers right side 
 *3. Using interfaces implement user service a. register the data b. read the data 
 *4. User register form must validate with regex 
 * 
 * 
 */

