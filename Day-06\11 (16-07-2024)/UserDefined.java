package com.exception;

public class UserDefined {

	public static void main(String[] args) {
		String number = "334o5";
		int n = 45;
		int d = 0;
		try {
			double doub = n/d;
			int num = Integer.parseInt(number);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch(ClassCastException e) {
			System.out.println("Class Cast");
		} catch(NumberFormatException e) {
			System.out.println("Number Format");
		} catch(MyException e) {
			System.out.println("String");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}

	}

}

class MyException extends RuntimeException {
}
