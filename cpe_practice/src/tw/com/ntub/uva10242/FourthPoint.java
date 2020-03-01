package tw.com.ntub.uva10242;
import java.util.Scanner;
public class FourthPoint {
	public static double x1, y1, x2, y2, x3, y3 = 0;
	public static int point = 0;
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextDouble()) {
			 x1 = input.nextDouble();
			 y1 = input.nextDouble();
			 x2 = input.nextDouble();
			 y2 = input.nextDouble();
			pointJudge(input.nextDouble(),input.nextDouble());
			pointJudge(input.nextDouble(),input.nextDouble());
			if(point == 2) {
				System.out.printf("%.3f %.3f",(x1-x2+x3),( y1-y2+y3));
			}else {
				System.out.printf("%.3f %.3f",(x3+x2-x1),( y3+y2-y1));				
			}
			System.out.println();
			
		}
	}
	public static Boolean pointJudge(Double x , Double y) {
		if((x == x1 && y == y1)) {
			point = 1;
			return false;
		}else if(x == x2 && y == y2) {
			point = 2;
			return false;
		}				
		x3 = x;
		y3 = y;
		return true;
	}
	
}
