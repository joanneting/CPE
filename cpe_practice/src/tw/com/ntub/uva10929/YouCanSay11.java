package tw.com.ntub.uva10929;

import java.util.Scanner;

public class YouCanSay11 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
			for(int i=0;i<1000;i++) {
				String number = input.next();
				if(number.equals("0"))break;
				boolean judge = false;
				int odd=0;
				int even=0;
				for(int j = 0; j < number.length(); j++) {
					if(j%2==0) {
						odd+=Integer.valueOf(number.charAt(j))-Integer.valueOf('0');
					}else {
						even+=Integer.valueOf(number.charAt(j))-Integer.valueOf('0');;
					}
				}
				if(Math.abs(odd-even)%11==0) {
					judge=true;
				}
				if(judge) {
					System.out.println(number + " is a multiple of 11.");
				}else {
					System.out.println(number + " is not a multiple of 11.");
				}
			}
	}
}
