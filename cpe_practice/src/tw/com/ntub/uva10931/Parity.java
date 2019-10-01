package tw.com.ntub.uva10931;

import java.util.Scanner;
import java.math.BigInteger;

public class Parity {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Integer number;
		while((number=input.nextInt())!=0) {		
			Integer count=Long.bitCount(number);
			String numberStr=Integer.toBinaryString(number);
			System.out.println("The parity of "+numberStr+" is " +count+" (mod 2).");
		}			
	}
}
