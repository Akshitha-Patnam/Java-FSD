package com.fls;
import java.nio.file.Files;
//copying data from one file to other file
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exp2 {

		public static void main(String []args) {
			Path srcpath=Paths.get("src/bytetest.txt");
			Path trgtpath=Paths.get("src/chartest.txt");
			try 
			{
				//copy (path source, path target, 
				Path path =Files.copy(srcpath, trgtpath, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("TARGET file location:" +path);
				System.out.println("Copied content:"+ new String(Files.readAllBytes(path)));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
