package com.algo;

public class Occurances {

	public static void main(String[] args) {
		String text = "We are students of GIFT college, third semester";
		//int alphaCount[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int alphaCount[] = new int[26];
		for(int i=0; i<alphaCount.length; i++) alphaCount[i] = 0;
		char each;
		
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			if(each>=65 && each<=90) {
				alphaCount[each-65]++;
			} else if(each>=97 && each<=122) {
				alphaCount[each-97]++;
			}
		}
		
		for(int i=0; i<alphaCount.length; i++) {
			if(alphaCount[i]>0)
				System.out.println((char)(i+65) + " = " + alphaCount[i]);
		}
	}

}
