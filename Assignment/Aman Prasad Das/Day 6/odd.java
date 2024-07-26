public class odd {
    public static void main(String[] args) {
        int sum = 0;
        int oddNumber = 1;
        for (int i = 0; i < 100; i++) {
            sum += oddNumber;
            oddNumber +=2;
        }
        System.out.println("Sum Of 50 Odd Numbers:"+sum);
        
    }
}