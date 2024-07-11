package com.lang;

public class Example {

	public static void main(String[] args) {
		byte[] alpha = {65,66,67,68,69,70};
		
		String name1 = new String();
		String name2 = "Mohan Maggi";
		
		String name3 = new String(alpha);
		System.out.println(name3);

		String name4 = new String(alpha);
		String name5 = new String(alpha);
		String name6 = new String(alpha);
		String name7 = new String(alpha);

	}

}
