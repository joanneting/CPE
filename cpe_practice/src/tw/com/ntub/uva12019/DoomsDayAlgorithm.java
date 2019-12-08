package tw.com.ntub.uva12019;

import java.util.Scanner;
public class DoomsDayAlgorithm {
	//2011 1/1 (六)
	// 比照範例答案 1/6 (四)  可得知 1/1(六)
	/*
	 * Sample Input
		8
		1 6 
		2 28
		4 5
		5 26
		8 1
		11 1
		12 25
		12 31
	 * Sample Output
		Thursday
		Monday
		Tuesday
		Thursday
		Monday
		Tuesday
		Sunday
		Saturday
	 */
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt(); 
		while(caseNumber > 0) {
			int firstInt = input.nextInt();
			int secondInt = input.nextInt();
			int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
			int passDay = 0;
			String[] week = {"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
		
			for(int i =0; i < firstInt-1; i++) {
				passDay+=day[i];
			}
			passDay += secondInt;
			int weekIndex = passDay%7;
			System.out.println(week[weekIndex]);
			caseNumber--;
		}
	}
}
