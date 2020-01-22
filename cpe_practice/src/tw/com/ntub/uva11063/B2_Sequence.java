package tw.com.ntub.uva11063;
import java.util.*;
//https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2004
public class B2_Sequence {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int count = 1;
		while(input.hasNextInt()) {
			int number = input.nextInt();
			int[] numberArray = new int[number];
//			int sumNumber = ((number-1)+1)*(number-1)/2;
//			int[] sum =new int[sumNumber];
			Map<Integer,Integer> sumMap = new HashMap<>();
			int firstNumber = input.nextInt();
			numberArray[0] = firstNumber;
			sumMap.put(firstNumber*2, firstNumber*2);
			boolean judge = true;
			if( firstNumber < 1) {
				judge = false;
				
			}
			for(int i = 1; i < number; i++) {
				int nextNumber = input.nextInt();
				numberArray[i] = nextNumber;
				int sum =  nextNumber + firstNumber;
				if(sumMap.get(sum) != null || numberArray[i-1] > numberArray[i]) {
					judge = false;
				}
				sumMap.put(sum, sum);
			}
			for(int i = 1; i < number; i++) {
				if(!judge  ) {
					judge = false;
					break;
				}
				for(int j = i; j < number; j++) {
					int sum = numberArray[i]+numberArray[j];
					if(sumMap.get(sum) != null) {
						judge = false;
						break;
					}
					sumMap.put(sum, sum);
				}
			}
			if(judge) {
				System.out.println("Case #"+count+": It is a B2-Sequence.");
			}else {
				System.out.println("Case #"+count+": It is not a B2-Sequence.");
			}
			System.out.println();
			count++;
		}
	}
}
