package tw.com.ntub.uva10093;
import java.util.Scanner;
public class AnEasyProblem {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String line = input.nextLine().trim();
			char[] elementArray = line.toCharArray();
			int total = 0;
			int max = 1;
			for(int i = 0; i < elementArray.length; i++) {
				char element = elementArray[i];
				int R = 0;
				if(element >= '0' && element <= '9') {
					R = element-'0';
				}else if(element >= 'A' && element <= 'Z'){
					R = element - 'A' + 10;
				}else if(element >= 'a' && element <= 'z') {
					R = element - 'a' + 36;
				}
				if(R > max) {
					max = R;
				}
				total += R;
			}
			for(int i = max; i < 62; i++) {
				if(total%i==0) {
					System.out.println(i+1);
					break;
				}else if(i == 61) {
					System.out.println("such number is impossible!");
				}
				
			}
			if(max > 62) {
				System.out.println("such number is impossible!");
			}
		}
	}
}
