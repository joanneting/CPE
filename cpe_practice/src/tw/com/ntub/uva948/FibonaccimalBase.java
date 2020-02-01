package tw.com.ntub.uva948;
import java.util.Scanner;
public class FibonaccimalBase {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		int[] fibArray = new int[100000000];
		fibArray[0] = 1;
		fibArray[1] = 2;
		int length = 0;
		for(int i = 2; i < 100000000; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
			if(fibArray[i]+fibArray[i-1] > 100000000) {
				length = i;
				break;
			}
		}
		while(caseNumber > 0) {
			int number = input.nextInt();
			boolean start = false;
			String fib = number+" = ";
			for(int i = length; i >=  0; i--) {
				if(number >= fibArray[i] && !start) {
						start = true;
						fib += "1";
						number -= fibArray[i];
				}else if(start) {
					if(number >= fibArray[i]) {
						fib += "1";
						number -= fibArray[i];
					}else {
						fib += "0";
					}
				}
			}
//			1 = 1 (fib)
			System.out.println(fib+" (fib)");
		}
	}
}
