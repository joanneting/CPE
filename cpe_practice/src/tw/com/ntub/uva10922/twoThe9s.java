package tw.com.ntub.uva10922;
import java.util.Scanner;
public class twoThe9s {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		String numberStr = input.nextLine();
		while(!numberStr.equals("0")) {
			boolean result = true;
			int degree = 0;
			String temp = numberStr;
			while(true) {
				int number = 0;
				
				for(int i = 0; i < temp.length();i++) {
					number += temp.charAt(i)-'0';
				}
				
				if(number % 9 == 0) {
					temp = String.valueOf(number);
					degree += 1;
				}else if(degree==0){
					result = false;
					break;
				}else {
					break;
				}
				if(number / 9 == 1) {
					break;
				}
				
			}
			
//			999999999999999999999 is a multiple of 9 and has 9-degree 3.
//			9 is a multiple of 9 and has 9-degree 1.
//			9999999999999999999999999999998 is not a multiple of 9.
			if(result) {
				System.out.println(numberStr+" is a multiple of 9 and has 9-degree "+degree+".");
			}else {
				System.out.println(numberStr+" is not a multiple of 9.");
			}
			numberStr = input.nextLine();
		}
	}
}
