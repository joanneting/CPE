package tw.com.ntub.uva10056;
import java.util.Scanner;
public class WhatIsTheProbability {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		while(caseNumber > 0) {
			int playerNumber = input.nextInt();
			double winProbability = input.nextFloat();
			int winPeople = input.nextInt();
			double startValue = winProbability;
			for(int i = 0; i < winPeople-1; i++) {
				startValue *= 1-winProbability ; 
			}
			double result = 0;
			if(winProbability != 0) {
				result = startValue/(1-Math.pow(1-winProbability,playerNumber)); 
			}
			
			
			
			System.out.printf("%.4f%n",result);
			caseNumber--;
		}
	}
}
