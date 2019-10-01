package tw.com.ntub.uva100;
import java.util.*;
public class The3nAdd1problem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int start=input.nextInt();
			int end = input.nextInt();
			int count=0;
			int forStart=0;
			int forEnd=0;
			if(start>end) {
				forStart=end;
				forEnd=start;
			}else {
				forStart=start;
				forEnd=end;
			}
			for(int i = forStart; i <= forEnd; i++) {
				int nowCount = 1;
				int number=i;
				while(number!=1) {
					nowCount++;
					if(number%2==0) {
						number/=2;
					}else {
						number=3*number+1;
					}
				}
				count = nowCount>count?nowCount:count;
			}
			System.out.println(start+" " +end+ " " +count);
		}
	}
}
