package tw.com.ntub.uva10050;
import java.util.Scanner;
import java.lang.reflect.*;;
public class Hartals {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Integer times = input.nextInt();
		for(int i=0; i < times; i++) {
			Integer day = input.nextInt();
			Integer group = input.nextInt();
			boolean[] notWork=new boolean[day+1];
			for(int j=0; j < group; j++) {
				Integer blank=input.nextInt();
				for(int k=1;k<=day;k++) {
					if(k%blank==0 ) {
						notWork[k]=true;
					} 
					if(k%7==0 || k%7==6){
						notWork[k]=false;
					}
				}
			}
			Integer count=0;
			for(int j = 0; j < notWork.length; j++) {
				count+=notWork[j]?1:0;
			}
			System.out.println(count);
		}
	}
}
//2
//1486
//3
//25
//48
//39
//2905
//3
//11
//27
//22



