package com.fls;

import java.io.FileWriter;

public class Exp3 {
	public static void main(String[]args) {
		try(FileWriter fw=new FileWriter("src/rsourcetest.txt"))
		{
			fw.write("This is simple try with resources example");
			System.out.println("Done");
		
		fw.flush();
		//flush is used to c
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
