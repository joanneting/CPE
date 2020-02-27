package tw.com.ntub.uva10221;
import java.util.Scanner;
public class Satellites {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String[] info = input.nextLine().replaceAll("\\s+"," ").split(" ");
			int r = 6440 + Integer.parseInt(info[0]);
			double deg = 0;
			if(info[2].equals("deg")) {
				deg = Double.parseDouble(info[1])%360;
			}else {
				deg = Double.parseDouble(info[1])/60%360;
			}
			if(deg > 180) {
				deg = 360 - deg;
			}
			double distance = 0;
			double chord = 0;
			if(deg == 180) {
				distance = 2*r;
			}else {
				//正弦定理
				distance = Math.sin(deg*Math.PI/180)*r/Math.sin((180 - deg)/2*Math.PI/180);
			}
			chord = 2 * r * Math.PI * deg/360;
			//換行 cpe : \r\n 、 uva : \n
			System.out.printf("%.6f %.6f\r\n",chord ,distance);
			
		}
	}
}
