package Com.tt.oop1;


//import Com.tt.oop1.BasicMath;

public class advanceMath extends BasicMath{
	int mul(int a, int b) {
		int mul;
		return mul = a*b;
	}//end of mul
	
	protected int div(int a, int b) {
		int div;
		div = a/b;
		return div;
		}//end of div
	
	public static void main(String[] args) {
		
		advanceMath am = new advanceMath ();
		int mul = am.mul(5, 10);
		int div =am.div(5, 10);
		int add = am.add(3, 6);
		System.out.println("The mul of two number: " +mul);
		System.out.println("The div of tho number:" +div);	
		System.out.println("The add tho number:"+add);
		
	//	System.out.println();
		
	  
	
	}//end of main

}//end of class
