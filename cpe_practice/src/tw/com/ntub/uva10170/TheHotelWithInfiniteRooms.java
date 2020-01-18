package tw.com.ntub.uva10170;
import java.util.Scanner;

// https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=13&page=show_problem&problem=1111

public class TheHotelWithInfiniteRooms {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLong()) {
			long initialMember = input.nextLong();
			long day = input.nextLong();
			long total = 0;
	
			for(long i=initialMember;i<=Math.pow(10, 15);i++) {
				total+=i;
				if(total >= day) {
					System.out.println(i);
					break;
				}
				
			}
		}
	}
}
