package com.exception;

public class VoterID {

	public static void main(String[] args) {
		int ages[] = {35,61,42,12,77,83,95,56,0,38,64,88,99,11,-55,59,73,0,15};
		
		for(int i=0; i<ages.length; i++) {
			try {
				checkAge(ages[i]);
				System.out.println(ages[i] + " is a valid age");
			} catch(NegativeAgeException e) {
				System.out.println(ages[i] + " " + e.getMessage());
			} catch(ZeroAgeException e) {
				System.out.println(ages[i] + " " + e.getMessage());
			} catch(TooYoungAgeException e) {
				System.out.println(ages[i] + " " + e.getMessage());
			} catch(TooOldAgeException e) {
				System.out.println(ages[i] + " " + e.getMessage());
			}
		}
	}

	private static void checkAge(int age) throws NegativeAgeException,
 												 ZeroAgeException,
												 TooYoungAgeException,
												 TooOldAgeException {
		if(age<0) throw new NegativeAgeException("Age is less than 0");
		else if(age==0) throw new ZeroAgeException("Age is zero");
		else if(age<18) throw new TooYoungAgeException("Age is less than 18");
		else if(age>90) throw new TooOldAgeException("Age is greater than 90");
	}
}
