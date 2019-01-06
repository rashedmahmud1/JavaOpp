package com.oop2;

import Com.tt.oop1.BasicMath;

public class Callingclass extends BasicMath{
	

	public static void main(String[] args) {
		Callingclass x = new Callingclass();
		int sub=x.sub(4, 2);
		System.out.println(sub);
	}//end of method

}//end of class
