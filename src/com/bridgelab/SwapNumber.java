package com.bridgelab;
public class SwapNumber {

	public static void main(String[] args) {
		int a=10,b=20;
		
		System.out.println("a="+a+"\tb="+b);

		/*int temp = a;
		a = b;
		b = a;*/

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a="+a+"\tb="+b);
	}
}