package tw.com.ntub.uva10235;
import java.util.Scanner;
public class SimplyEmirp {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int number = input.nextInt();
			boolean prime = true;
			boolean emirp = true;
			for(int i = 2; i < number; i++) {
				
				if(number/i == number/Double.valueOf(i) || number/(number-i) == number/Double.valueOf(number-i)) {
//					System.out.println(number / i + " "+number/(number-i));
					if(number -i!=1) {
						prime = false;
						break;
					}
				}
				
				if(i == number-(i-2) || i == number-(i-2)+1) {
					break;
				}
			}
			String numberStr = String.valueOf(number);
			String rebmunStr = "";
			for(int i = numberStr.length()-1; i >= 0 ; i--) {
				rebmunStr +=numberStr.charAt(i);
			}
			int rebmun = Integer.parseInt(rebmunStr);
			if(number == rebmun) emirp = false;
			for (int i = 2; i < rebmun; i++) {
				if(!emirp) break;
				if (rebmun / i == rebmun / Double.valueOf(i) || rebmun/(rebmun-i) == rebmun/Double.valueOf(rebmun-i)) {
					emirp = false;
				}
			
				if(i == rebmun-(i-2) || i == rebmun-(i-2)+1) {
					break;
				}
			}
			
			if(prime && !emirp) {
				System.out.println(number+" is prime.");
			}else if(prime && emirp) {
				System.out.println(number+" is emirp.");
			}else{
				System.out.println(number+" is not prime.");
			}
		}
	}
}
