package tw.com.ntub.uva11461;
import java.util.Scanner;
public class SquareNumber {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			for(int i=0;i<201;i++) {
				Integer startNumber = input.nextInt();
				Integer endNumber = input.nextInt();
				if(startNumber==0 && endNumber == 0)break;
				if(startNumber >0 && startNumber<=endNumber && endNumber<=100000) {
					Integer count = 0;
					
					while(startNumber<=endNumber) {
						
						int startSqrt = (int)Math.sqrt(startNumber);
						int endSqrt=(int)Math.sqrt(endNumber);
						
						if(startSqrt*startSqrt==startNumber)count++;
						if(endSqrt*endSqrt==endNumber)count++;
						startNumber++;
						endNumber--;
						if(startNumber == endNumber) {
							startSqrt=(int)Math.sqrt(startNumber);
							if(startSqrt*startSqrt==startNumber)count++;
							break;	
						}
					}
					System.out.println(count);
					for(int j=startNumber;j<=endNumber;j++) {
						int sqrt=(int)Math.sqrt(j);
						if(sqrt*sqrt==j)count++;
						
					}
				}
			}
			
		}
	}
}
/*
1 4
1 10
1 100000
798 30923
1 5727
31 28163
10 2822
90 23629
1 32246
53 21867
4 14951
46 24145
5 12581
0 0
*/