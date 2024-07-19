WAP to sum first fifty odd numbers?
ANS:-
public class SumFirstFiftyOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 1; 
        
        while (count < 50) {
            sum += number;
            number += 2;
            count++;
        }
        
  
        System.out.println("Sum of the first fifty odd numbers: " + sum);
    }
}    
