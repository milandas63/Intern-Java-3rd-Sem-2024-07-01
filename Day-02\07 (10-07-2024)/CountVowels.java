package com.algo;

public class CountVowels {
	public static void main(String[] args) {
		String text = "We are students of GIFT college, third semester";
		// A - 1
		// B - 0
		// C - 1
		// retsemes driht ,egelloc TFIG fo stneduts era eW
		// retsemes driht ,egelloc TFIG fo stneduts era eW
		String vowels = "AEIOUaeiou";
		int count = 0;
		char each;
		
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			for(int j=0; j<vowels.length(); j++) {
				if(each==vowels.charAt(j)) {
					count++;
					break;
				}
			}
		}
		System.out.println("Total vowels = "+count);
		System.out.println();
		
		for(int i=text.length()-1; i>=0; i--) {
			each = text.charAt(i);
			System.out.print(each);
		}
	}
}
