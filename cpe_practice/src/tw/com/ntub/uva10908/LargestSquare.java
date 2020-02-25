package tw.com.ntub.uva10908;
import java.util.Scanner;
public class LargestSquare {
	public static String[][] rectangular ;
	public static String centerChar = "";
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = Integer.parseInt(input.nextLine());
		while(caseNumber > 0) {
			caseNumber--;
			String info = input.nextLine();
			String[] infoArray = info.split(" ");
			int M = Integer.parseInt(infoArray[0]);
			int N = Integer.parseInt(infoArray[1]);
			int Q = Integer.parseInt(infoArray[2]);
			rectangular = new String[M][N];
			for(int i = 0; i < M; i++) {
				String[] content = input.nextLine().split("");
				rectangular[i] = content;
			}
			System.out.println(info);
			while(Q > 0) {
				String[] center = input.nextLine().split(" ");
				int x = Integer.parseInt(center[0]);
				int y = Integer.parseInt(center[1]);
				boolean judge = true;
				int sideLength = 1;
				centerChar = rectangular[x][y];
				while(judge) {
					judge = countLength(x, y, sideLength);
					
					if(!judge) {
						sideLength -= 2;
					}else {
						x -= 1;
						y -= 1;
						sideLength += 2;
					}
					if(x+sideLength > M || y+sideLength > N || x < 0 || y < 0) {
						sideLength -= 2;
						judge = false;
					}
				}
				System.out.println(sideLength);
				Q--;
			}
		}
	}
	public static boolean countLength(int x, int y, int sideLength) {
	
		boolean judge = true;
		for(int i = 0; i < sideLength; i++) {
			for(int j = 0; j < sideLength; j++) {
			
				if(i != 0 && i+1 != sideLength) {
					if(!rectangular[x+i][y].equals( centerChar) || !rectangular[x+i][y+sideLength-1] .equals( centerChar)) {
						judge = false;
					}
					break;
				}else {
					if(!rectangular[x+i][y+j].equals(centerChar)) {
						judge = false;
						break;
					}
				}
			}
			if(!judge)
				break;
		}
		return judge;
	}
}
