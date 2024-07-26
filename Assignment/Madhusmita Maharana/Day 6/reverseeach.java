public class reverseeach {
    public static class Main {
        public static void main(String[] args) {
            String original = "Quick Brown Fox Jumps Over The Lazy Dog";
            String reversed = reverseEachWord(original);
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }
    
        public static String reverseEachWord(String str) {
            String[] words = str.split(" ");
            StringBuilder reversed = new StringBuilder();
    
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word).reverse();
                reversed.append(reversedWord).append(" ");
            }
    
            return reversed.toString().trim();
        }
    }
}
