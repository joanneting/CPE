package tw.com.ntub.uva10812;
import java.util.Scanner;
//https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1753
public class BeattheSpread {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		while(caseNumber > 0) {
			long sum = input.nextLong();
			long subtraction = input.nextLong();
			long total = sum + subtraction;
			long x = -1;
			long y = -1;
			
			if((long)(total/2.0) == total/2.0) {
				x = total/2;
				y = sum - x;
			}
			if(x < 0 || y < 0) {
				System.out.println("impossible");
			}else {
				System.out.println(x+" "+y);
			}
			
			
			caseNumber--;
		}
	}
}
