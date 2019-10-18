package tw.com.ntub.uva10101;

import java.util.Scanner;

public class BanglaNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] stringArray = { "shata" /* 100 */, "hajar" /* (1,000) */, "lakh"/* (100,000) */,
				"kuti" /* (10,000,000) */ };
		int[] intArray = { 10, 100, 100, 100 };

		int caseNumber = 1;
		while (input.hasNextLong()) {
			int count = 0;
			long number = input.nextLong();

			String[] stringNumber = new String[10];

			if (caseNumber < 10) {
				System.out.print("   " + caseNumber + ".");
			} else if (caseNumber < 100) {
				System.out.print("  " + caseNumber + ".");
			} else if (caseNumber < 1000) {
				System.out.print(" " + caseNumber + ".");
			} else {
				System.out.print(caseNumber + ".");
			}
			if(number ==0) {
				System.out.print(" "+0);
			}else {
				count(number);
			}
			caseNumber++;
			System.out.println();
//			1. 23 hajar 7 shata 64
//			2. 45 lakh 89 hajar 7 shata 45 kuti 89 lakh 73 hajar 9 shata 58
		}
	}

	public static void count(long number) {
		// "shata" /*100*/,"hajar" /*(1,000)*/,"lakh"/* (100,000)*/,"kuti"
		// /*(10,000,000)*/
		if (number >= 10000000) {
			count(number / 10000000);
			System.out.print(" kuti");
			count(number%10000000);
		} else if (number >= 100000) {
			count(number / 100000);
			System.out.print(" lakh");
			count(number%100000);
		} else if (number >= 1000) {
			count(number / 1000);
			System.out.print(" hajar");
			count(number%1000);
		} else if (number >= 100) {
			count(number / 100);
			System.out.print(" shata");
			count(number%100);
		} else if (number != 0) {
			System.out.print(" "+number);
		}

	}
}
