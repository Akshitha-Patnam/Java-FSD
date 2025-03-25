package com.fls;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ByteRead {
	public static void main(String[] args) {
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		try 
		{
			fis =new FileInputStream("src/bytetest.txt");
			bis =new BufferedInputStream(fis);
			//byte storage location
			byte[] br=new byte[1024];
			int x=0;
			while((x=bis.read(br))!=-1)
			{
				//covert from byte array to string format for Reading file 
				System.out.println(new String(br,0,x));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				fis.close();
				bis.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
