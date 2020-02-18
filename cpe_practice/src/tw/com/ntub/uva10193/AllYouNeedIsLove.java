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
			int min = 0;
			if(s1Int > s2Int) {
				min = s2Int;
			}else {
				min = s1Int;
			}
//			Pair #1: All you need is love!
//			Pair #2: Love is not all you need!
			String result= "Pair #"+nowCase+": Love is not all you need!";
			for(int i = 2; i <= min; i++) {
				double d = i;
				if(s1Int/d == s1Int/i && s2Int/d == s2Int/i ) {
					result = "Pair #"+nowCase+": All you need is love!";
					break;
				}
			}
			System.out.println(result);
			nowCase ++;
		}
	}
}
