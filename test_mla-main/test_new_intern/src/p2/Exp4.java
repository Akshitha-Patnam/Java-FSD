package p2;

import p1.Exp1;

class Exp5 //extends Exp1
{
	Exp1 obj = new Exp1();
	
	public void disp()
	{
		//System.out.println(obj.pin);
		//System.out.println(obj.phone);
		//System.out.println(obj.wifip);
		
		System.out.println(obj.citypin);
	}
}

class Exp6 extends Exp1
{
	public void disp()
	{
		//System.out.println(pin);//private
		//System.out.println(phone);//default within the package
		
		System.out.println(wifip);//all the subclasses 
		System.out.println(citypin);//all the classes
	}
}

public class Exp4 {
	
	public static void main(String[] args) {
		
	}

}
