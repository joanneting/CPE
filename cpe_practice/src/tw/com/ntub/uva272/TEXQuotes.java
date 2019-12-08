package tw.com.ntub.uva272;
import java.util.Scanner;
public class TEXQuotes {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int index = 1;
		
		while(input.hasNext()) {
			String line = input.nextLine();
			String result="";
			for(int i=0;i<line.length();i++) {
				char word = line.charAt(i);
				if(word == '"') {
					if(index%2 == 1) {
						result+="``";
						
					}else {
						result+="''";
						
					}
					index++;
				}else {
					result+=word;
				}
			}
			System.out.println(result);
		}
		
	}
}
