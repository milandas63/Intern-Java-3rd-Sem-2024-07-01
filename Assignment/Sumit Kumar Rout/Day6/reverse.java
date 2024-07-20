public class reverse {
    public static void main(String[] args) {
		String text = "Engineering Students";
		StringBuffer buf = new StringBuffer();
		char each;
		for(int i=text.length()-1; i>=0; i--) {
			each = text.charAt(i);
			buf.append(each);
		}
		System.out.println("Original:  "+text);
		System.out.println("Reverse:   "+buf);
		System.out.println("Reverse(): "+buf.append(text).reverse());
	}

}
