WAP To find 10 subsequent number in the series?
       2.1 1,2,4,8,16.............
 ANS:-
public class SubsequentNumbersInSeries {
    public static void main(String[] args) {
        int currentNumber = 1;
        System.out.println("First 10 subsequent numbers in the series:");
        System.out.print(currentNumber + " ");
        for (int i = 1; i <= 10; i++) {
            currentNumber *= 2; 
            System.out.print(currentNumber + " ");
        }
    }
}

       2.2 1,2,3,5,5,13.............
ANS:-
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
