package tw.com.ntub.uva10038;
import java.util.Scanner;
public class JollyJumpers {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String line = input.nextLine();
			String[] words = line.split(" ");
			int n = Integer.valueOf(words[0]);
			String result="Jolly";
			boolean[] record = new boolean[n];
			for(int i = 0; i < n; i++) {
				record[i]=false;
			}
			int[] difference =new int[n-1];
			for(int i = 1; i < n; i++) {
				difference[i-1] = Math.abs(Integer.valueOf(words[i])-Integer.valueOf(words[i+1]));
			}
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < n-1; j++) {
					if(difference[j] == i) {
						record[i] = true;
					}
				}
			}
			for(int i = 1; i < n; i++) {
				if(!record[i]) {
					result="Not jolly";
				}
			}
			System.out.println(result);
		}
	}
}
