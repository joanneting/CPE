package tw.com.ntub.uva10008;
import java.util.Scanner;
public class WhatIsCryptanalysis {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[26];
		int max = 0;
		for(int i = 0; i < 26; i++) {
			array[i] = 0;
		}
		int lines = Integer.valueOf(input.nextLine());
		while(lines > 0) {
			String line = input.nextLine().toUpperCase();
			for(int i = 0; i < line.length(); i++) {
				int word = line.charAt(i);
				int start = (int)'A';
				int end = (int)'Z';
				if(word >= start && word <= end) {
					array[(word-start)] ++;
				}
			}
			lines--;
		}
		for(int i = 0; i < 26; i++) {
			max = (array[i] > max) ?array[i]:max;
		}
		int A = (int)'A';
		while(max > 0) {
			for(int i = 0; i < 26; i++) 
				System.out.print((array[i] == max)?(char)(A+i)+" "+max+"\n":"");
			max--;
		}
	}
}
