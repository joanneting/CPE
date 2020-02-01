package tw.com.ntub.uva10071;
import java.util.Scanner;
public class BacktoHighSchoolPhysics {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()) {
			int v = input.nextInt();
			int t = input.nextInt();
			int d = (0+v*2)*(t*2)/2;
			System.out.println(d);
		}
	}
}
