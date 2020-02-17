package tw.com.ntub.uva11005;
import java.util.Scanner;
public class CheapestBase {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseX = input.nextInt();
		for(int x = 1; x <= caseX; x++) {
			System.out.println("Case "+x+":");
			int[] costArray =new int[36];
			 for(int i = 0; i < 36; i++) {
				 costArray[i] = input.nextInt(); 
			 }
			 int caseY = input.nextInt();
			
			 while(caseY > 0) {
				 int number = input.nextInt(); 
				 System.out.print("Cheapest base(s) for number "+number+":");
				 int[] total = new int[37];
				 for(int i = 2; i < 37; i++) {
//					 total[i] = 0;
					 int numberTemp = number;
					 while(numberTemp > 0) {
						 int cost = numberTemp%i;
						 numberTemp /= i;
						 total[i] += costArray[cost]; 
						
					 }
				 }
				 int minCost = total[2];
				 for(int i = 2; i < 37; i++) {
					 if(total[i] < minCost) minCost = total[i];
				 }
				 for(int i = 2; i < 37; i++) {
					 if(total[i] == minCost) System.out.print(" "+i);
				 }
				 caseY --;

			 }
			 if(x!=caseX)System.out.println();
		}
	}
}
