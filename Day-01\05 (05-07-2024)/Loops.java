
public class Loops {
	public static void main(String[] args) {
		int i = 0;
		for(;i<10;) {
			System.out.println("Hello World!");
			i++;
		}
		System.out.println();

		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		System.out.println();
		
		for(String dayname:days) {
			System.out.println(dayname);
		}
		
		System.out.println();
		while(i<25) {
			System.out.println("Value of i is "+i);
			i++;
		}
		
		System.out.println();
		do {
			System.out.println("Value of i is already 24");
		} while(i<24);
		
	}
}
