package tw.com.ntub.uva10268;
import java.util.Scanner;
public class FourNineEight_bis {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String line = input.nextLine().trim();
			long xValue = Long.valueOf(line);
			line = input.nextLine().replaceAll("  "," ");
			String[] finalArray = line.split(" ");
			long result=0;
			int nValue = finalArray.length-1;
//			System.out.println(finalArray.length);
			for(int i=0;i<=nValue;i++) {
//				System.out.println("a  :  " + finalArray[i]);
//				System.out.println(xValue+"n : "+(nValue-(i+1)));
//				System.out.println("result  :  " + Math.pow(xValue,nValue-(i+1)));
				if(xValue==0 && (nValue-(i+1))==-1)
					continue;
//				System.out.println("result  :  " + Math.pow(xValue,nValue-(i+1)));
				result += Long.valueOf(finalArray[i])*(nValue-i)*Math.pow(xValue,nValue-(i+1));
//				System.out.println(result);
			}
			System.out.println(result);
			
		}
	}
}
