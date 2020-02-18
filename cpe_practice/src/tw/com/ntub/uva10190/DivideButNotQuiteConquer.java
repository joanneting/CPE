package tw.com.ntub.uva10190;
import java.util.Scanner;
public class DivideButNotQuiteConquer {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()) {
			int divisor = input.nextInt();
			int dividend = input.nextInt();
			String result = "";
			result += divisor;
			while(divisor > 1 ) {
				if(dividend == 0 || dividend == 1) {
					break;
				}
				if(divisor/dividend == divisor/Double.valueOf(dividend)) {
					divisor /= dividend;
					result += " "+divisor;
				}else {
					result = "Boring!";
					break;
				}
			}
			if(result.split(" ").length == 1 || result.equals("")) {
				result = "Boring!";
			}
			System.out.println(result);
		}
	}
}
