package tw.com.ntub.uva11417;
import java.util.Scanner;
public class GCDProbleam {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int number;
		while((number = input.nextInt()) != 0) {
			int G = 0;
			for(int i = 1; i < number; i++) {
				for(int j = i+1; j <= number; j++) {
					G += GCD(i,j);
				}
			}
			System.out.println(G);
		}
	}
	public static int GCD(int i, int j) {
		while(j != 0) {
			int temp = j;
			j = i % j;
			i = temp;
		}
		
		return i;
	}
}
