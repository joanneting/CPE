package tw.com.ntub.uva10019;
import java.util.Scanner;
public class FunnyEncryptionMethod {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		while(caseNumber > 0) {
			int N = input.nextInt();
			int X1 = N;
			String result = "";
			int count = 0;
			while(X1 > 0) {
				if(X1%2 == 1) {
					count+=1;
				}
				X1 /= 2;
				
			}
			result+=count+" ";
			int X2= N;
			count = 0;
			while(X2 > 0) {
				int lastNumber = X2%10;
				X2 /= 10;
				while(lastNumber > 0) {
					if(lastNumber%2 == 1) {
						count += 1;
					}
					lastNumber /=2;
				}
			}
			result += count;
			System.out.println(result);
			caseNumber--;
		}
	}
}
