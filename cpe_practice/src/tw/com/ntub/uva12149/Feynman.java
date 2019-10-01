package tw.com.ntub.uva12149;
import java.util.Scanner;
public class Feynman {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		Integer number = 0 ;
		while((number=input.nextInt())!=0){
			Integer count = 0;
			for(int i=number;i>0;i--) {
				count+=i*i;
			}
			System.out.println(count);
		}
		
	}
}
