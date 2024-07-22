import java.util.StringTokenizer;

public class stringtokenizer {
    public static void main(String[] args) {
        String original = "Quick Brown Fox Jumps Over The Lazy Dog";
        String reversed = reverseEachWord(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseEachWord(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        StringBuilder reversed = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversed.append(reversedWord).append(" ");
        }

        return reversed.toString().trim();
    }
}