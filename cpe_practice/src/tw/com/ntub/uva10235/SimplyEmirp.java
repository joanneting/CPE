package tw.com.ntub.uva10235; 
import java.util.Scanner; 
public class SimplyEmirp { 
	public static void main(String arg[]) { 
		Scanner input = new Scanner(System.in); 
		while(input.hasNext()) { 
			int number = input.nextInt(); 
			boolean prime = true; 
			boolean emirp = true; 
			prime = judge(number);
			String numberStr = String.valueOf(number); 
			String rebmunStr = ""; 
			for(int i = numberStr.length()-1; i >= 0 ; i--) { 
				rebmunStr +=numberStr.charAt(i); 
			} 
			int rebmun = Integer.parseInt(rebmunStr);
			if(number == rebmun) {
				emirp = false; 
			}else {
				emirp = judge(rebmun);
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
	public static boolean judge(int number) {
		for(int i = 2; i < number; i++) { 
			if(number%i == 0|| number%(number-i) == 0) { 
				if(number -i!=1) { 
					return false; 
				} 
			} 
			 
			if(i == number-(i-2) || i == number-(i-2)+1) { 
				break; 
			} 
		} 
		return true;
	}
} 
