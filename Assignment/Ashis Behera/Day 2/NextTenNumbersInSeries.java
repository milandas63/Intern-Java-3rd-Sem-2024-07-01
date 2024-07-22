
public class NextTenNumbersInSeries {

	public static void main(String[] args) {
		
		
		 int firstNumber = 1;
	        int secondNumber = 2;
	        System.out.println("First 12 numbers in the series:");
	        System.out.print(firstNumber + " "); 
	        System.out.print(secondNumber + " "); 
	        for (int i = 3; i <= 12; i++) {
	            int nextNumber = firstNumber + secondNumber;
	            System.out.print(nextNumber + " ");
	            firstNumber = secondNumber;
	            secondNumber = nextNumber;
	        }

	}

}
