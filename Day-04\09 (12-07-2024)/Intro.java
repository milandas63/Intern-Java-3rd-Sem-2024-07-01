package com.exception;

public class Intro {

	public static void main(String[] args) {
		int n = 99;
		int d = 3;
		
		try {
			double r = n/d;
			System.out.println("Result is: "+r);
			
			String name = "James Gosling";
			System.out.println(name.charAt(6));
			System.out.println(name.charAt(9));
	
			String parent = null;
			System.out.println(parent.concat("World!"));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("1111");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2222");
		} catch(ArithmeticException e) {
			System.out.println("3333");
		} catch(NullPointerException e) {
			System.out.println("4444");
		} catch(ClassCastException e) {
			System.out.println("5555");
	}
		
	}

}
