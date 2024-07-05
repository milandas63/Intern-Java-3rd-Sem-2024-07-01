
public class Palindrome {
	public static void main(String[] args) {
		int spaces = 40;
		for(int line=1; line<=9; line++) {
			for(int space=1; space<=spaces; space++) System.out.print(" ");
			for(int num=1; num<=line; num++) System.out.print(num);
			for(int num=(line-1); num>=1; num--) System.out.print(num);
			System.out.println();
			spaces--;
		}
	}
}
