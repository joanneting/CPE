package tw.com.ntub.uva948;
import java.util.Scanner;
public class way3 {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		
	
		while(caseNumber > 0) {
		
			int number = input.nextInt();
			String fib = number+" = ";
			int[] fibArray = new int[number];
			fibArray[0] = 1;
		
			int length = 0;
			if(number == 2) {
				length = 1;
			}
			if(number != 1){
				fibArray[1] = 2;
			}
		
			for(int i = 2; i < number; i++) {
				fibArray[i] = fibArray[i-1] + fibArray[i-2];
				if(fibArray[i]+fibArray[i-1] > number) {
					length = i;
					break;
				}
			}
			
			while(length>=0) {
				if(fibArray[length] <= number) {
					number -= fibArray[length];
					fib+="1";
				}else {
					fib+="0";
				}
				length--;
			}
			
//			1 = 1 (fib)
			System.out.println(fib+" (fib)");
			caseNumber--;
		}
	}
}
