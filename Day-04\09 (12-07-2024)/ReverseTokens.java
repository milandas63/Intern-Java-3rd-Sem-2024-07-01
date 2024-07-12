package com.string;

import java.util.StringTokenizer;

public class ReverseTokens {

	public static void main(String[] args) {
		String original = "Quick,Brown,Fox,Jumps,Over,The,Lazy,Dog";
		StringTokenizer st = new StringTokenizer(original,",");
		while(st.hasMoreTokens()) {
			System.out.println(new StringBuffer(st.nextToken()).reverse());
		}
	}
}
