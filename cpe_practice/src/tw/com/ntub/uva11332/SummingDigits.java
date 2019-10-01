package tw.com.ntub.uva11332;
import java.util.Scanner;
public class SummingDigits {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Integer number = 0;
		while((number = input.nextInt())!=0) {
			while(number >= 10) {
				String numberStr = String.valueOf(number);
				number=0;
				for(int i=0; i < numberStr.length(); i++) {
					number+=Integer.valueOf(numberStr.charAt(i))-48;
				}
			}
			System.out.println(number);
		}
		
	}
}
