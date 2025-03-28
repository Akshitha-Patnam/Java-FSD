package com.fls;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialDemo {
	public static void main(String[] args) {
		FileInputStream fis =null;
		BufferedInputStream bis=null;
		ObjectInputStream objis=null;
		try 
		{
			fis= new FileInputStream("src/curstomer.txt");
			bis=new BufferedInputStream(fis);
			objis=new ObjectInputStream(bis);
			Customer cst=(Customer)objis.readObject();
			System.out.println(cst.getId()+" "+ cst.getName()+" "+cst.getCity()+" "+cst.getPincode());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				objis.close();
				bis.close();
				fis.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
