package tw.com.ntub.uva10783;

import java.util.Scanner;
import java.math.BigInteger;

public class OddSum {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Integer number=input.nextInt();
		Integer times=0;		
		while(times!=number) {		
			times++;
			Integer start=input.nextInt();
			Integer end=input.nextInt();
			if(start%2==0)start++;
			if(end%2==0)end--;
			Integer total=(start+end)*((end-start)/2+1)/2;
			System.out.println("Case "+times+": "+total);			
		}			
	}
}

