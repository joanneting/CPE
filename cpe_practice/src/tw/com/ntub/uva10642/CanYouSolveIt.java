package tw.com.ntub.uva10642;
import java.util.Scanner;
public class CanYouSolveIt {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		int nowCase = 1;
		while(nowCase <= caseNumber ) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			long result = 0;
			int total = x2 + y2;
			int start = x1 + y1;
			if(x2 + y2 > 1) {
				result += (2 + (total+1)) * ((total) /2.0) - (total-x2);
			}else if(x2 == 1){
				result = 2;
			}else if(y2 == 1) {
				result = 1;
			}
			if(x1 + y1 > 1) {
				
				result -= (2 + (start)) * ((start-1) /2.0) + start - y1 + 1; 
			}else if(x1 == 1){
				result -= 1;
			}
			
			System.out.println("Case "+nowCase+": "+result);
			nowCase ++;
		}
	}
}
