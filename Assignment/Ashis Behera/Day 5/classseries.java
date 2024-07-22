public class classseries {
        public static void main(String[] args) {
            // Series 1: Geometric progression (multiplying by 2)
            System.out.println("Series 1:");
            int series1Start = 1;
            int series1Next = series1Start;
            for (int i = 0; i < 10; i++) {
                System.out.print(series1Next + " ");
                series1Next *= 2;
            }
            System.out.println();
            
            // Series 2: Fibonacci-like sequence
            System.out.println("Series 2:");
            int a = 1;
            int b = 2;
            int series2Next = a;
            System.out.print(series2Next + " ");
            for (int i = 1; i < 10; i++) {
                System.out.print(b + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
}
