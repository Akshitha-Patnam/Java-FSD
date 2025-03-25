 
package p1;


public class Exp1 {
	
	private int pin = 123123;
	
	      int phone = 1234512345;
	      
	protected int wifip = 3434;
	
	public int citypin = 500098;
	
	public void disp()
	{
		System.out.println(pin);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}
	
	public static void main(String[] args) {
		
		Exp1 obj = new Exp1();
		
		obj.disp();
	}
}

class Exp2 extends Exp1
{
	public void disp()
	{
		//System.out.println(pin);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}
}
