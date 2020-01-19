package tw.com.ntub.uva10268;
import java.util.Scanner;
public class FourNineEight_bis {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String line = input.nextLine().trim();
			long xValue = Long.valueOf(line);
			line = input.nextLine();
			String[] finalArray = line.split("\\s+");
			long result=0;
			int nValue = finalArray.length-1;
			/*cpe評測可過，uva不行
			for(int i=0;i<nValue;i++) {
				result += Long.valueOf(finalArray[i])*(nValue-i)*Math.pow(xValue,nValue-(i+1));//Math.pow() return int ，long 會有溢出問題
			}
			*/
			
			long xp = 1;
			for(int i = nValue-1;i>=0;i--) {	
				result +=  Long.valueOf(finalArray[i])*(nValue-i)*xp;
				xp*=xValue;
			}
			
			System.out.println(result);
			
		}
	}
}
