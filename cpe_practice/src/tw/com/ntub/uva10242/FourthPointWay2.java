package tw.com.ntub.uva10242;
import java.util.Scanner;
public class FourthPointWay2 {
	
	
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String[] coordinates = input.nextLine().replaceAll("\\s"," ").split(" ");
			double x1 = Double.parseDouble(coordinates[0]);
			double y1 = Double.parseDouble(coordinates[1]);
			double x2 = Double.parseDouble(coordinates[2]);
			double y2 = Double.parseDouble(coordinates[3]);
			double x3 = 0;
			double y3 = 0;
			int point = 0;
			for(int i = 4; i < coordinates.length; i=i+2) {
				Double tempx = Double.parseDouble(coordinates[i]);
				Double tempy = Double.parseDouble(coordinates[i+1]);
				if((tempx == x1 && tempy == y1)) {
					point = 1;
					continue;
				}else if(tempx == x2 && tempy == y2) {
					point = 2;
					continue;
				}				
				x3 = tempx;
				y3 = tempy;
			}
			if(point == 2) {
				System.out.printf("%.3f %.3f",(x1-x2+x3),( y1-y2+y3));
			}else {
				System.out.printf("%.3f %.3f",(x3+x2-x1),( y3+y2-y1));				
			}
			System.out.println();
			
		}
	}

	
}
