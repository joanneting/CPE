package tw.com.ntub.uva11349;
import java.util.Scanner;
//https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2324
public class SymmetricMatrix {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = Integer.valueOf(input.nextLine().trim());
		int count = 0;
		while(caseNumber > 0) {
			caseNumber --;
			count ++;
			int n = Integer.valueOf(input.nextLine().replace(" ", "").split("=")[1]);
			long[][] matrix = new long[n][n];
			for(int i = 0; i < n; i++) {
				String[] element = input.nextLine().trim().split(" ");
				for(int j = 0; j < n; j++) {
					matrix[i][j] = Long.valueOf(element[j]); 
				}
			}
			boolean symmetric = true;
			for(int i = 0; i < n;i++) {
				for(int j = 0; j < n; j++) {
					if(matrix[i][j] < 0 ) {
						symmetric = false;
						
					}
					if(matrix[i][j]!=matrix[n-1-i][n-1-j]) {
						symmetric = false;
					}
				}
				if(!symmetric) {
					break;
				}
			}
			String result = "";
			if(symmetric) {
				result = "Test #"+count+": Symmetric.";
			}else {
				result = "Test #"+count+": Non-symmetric.";
			}
			System.out.println(result);
			
			
		}
		
	}
}
