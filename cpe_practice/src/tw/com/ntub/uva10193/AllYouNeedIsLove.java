package tw.com.ntub.uva10193;
import java.util.Scanner;
public class AllYouNeedIsLove {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = Integer.valueOf(input.nextLine());
		int nowCase = 1;
		while(caseNumber >= nowCase) {
			String[] s1 = input.nextLine().split("");
			String[] s2 = input.nextLine().split("");
			int s1Int = 0;
			int s2Int = 0;
			int pow = 1;
			for(int i = s1.length-1;i >= 0; i--,pow*=2) {
				s1Int += Integer.valueOf(s1[i])*pow; 
			}
			pow = 1;
			for(int i = s2.length-1;i >= 0; i--,pow*=2) {
				s2Int += Integer.valueOf(s2[i])*pow; 
			}
			
//			Pair #1: All you need is love!
//			Pair #2: Love is not all you need!
			String result= "Pair #"+nowCase;
			while(s2Int!=0) {
				int temp = s2Int;
				s2Int = s1Int % s2Int;
				s1Int = temp;
			}
			if(s1Int==1) {
				result+=": Love is not all you need!";
			}else {
				result+=": All you need is love!";
			}
			System.out.println(result);
			nowCase ++;
		}
	}
}
