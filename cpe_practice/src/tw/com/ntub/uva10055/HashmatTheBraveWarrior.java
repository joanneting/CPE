package tw.com.ntub.uva10055;

import java.util.Scanner;
import java.math.BigInteger;

public class HashmatTheBraveWarrior {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		long ourArmy=0;
		long enemer=0;		
		while(input.hasNextLong()) {		
			ourArmy=input.nextLong();
			enemer=input.nextLong();
			System.out.println(Math.abs(ourArmy-enemer));
						
		}			
	}
}


