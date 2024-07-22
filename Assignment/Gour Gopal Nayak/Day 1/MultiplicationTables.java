
	public class MultiplicationTables {
	    public static void main(String[] args) {
	        printMultiplicationTables();
	    }
	    
	    public static void printMultiplicationTables() {
	        for (int i = 2; i <= 40; i++) {
	            System.out.println("Multiplication Table of " + i + ":");
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	            System.out.println(); 
	        }
	    }
	}

