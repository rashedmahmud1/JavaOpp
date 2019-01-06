package Com.tt.oop1;

public class BasicMath {
	int add(int a, int b) {
		int sum ;
		sum = a+b;
		return sum;
		
	}//end add
	protected int sub(int a, int b) {
		int sub;
		sub = a- b;
		return sub;
		
	}//end sub
	
	
public static void main(String[] args) {
	BasicMath bm = new BasicMath();
	
	int sum = bm.add(20, 25);
	System.out.println("The sum of two number:" +sum);
	
	int sub = bm.sub(10, 5);
	System.out.println("The sub of two number:" +sub);
	
	
	
		
		
		
		
		
		
		
		
     

	}//end main
	

}//end of the class
