package tw.com.ntub.uva10222;

import java.util.Scanner;

public class DecodeTheMadMan {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		String[] mapArray = {"q","a","z","w","s","x","e","d","c","r","f","v","t","g","b","y","h","n","u","j","m","i","k","o","l","p"};
		String[] inputArray={"e","d","c","r","f","v","t","g","b","y","h","n","u","j","m","i","k",",","o","l",".","p",";","[","'","]"};
		while(input.hasNextLine()) {
			String word = input.nextLine().toLowerCase();
			String[] resultArray = new String[word.length()];
			int resultIndex = 0;
			for(int i = 1; i <= word.length(); i++) {
				String singleword = word.substring(i-1, i);
				int index = 0;
				if(singleword.equals(" ")) {
					resultArray[resultIndex] = " ";
					resultIndex++;
					continue;
				}
				for(int j = 0; j < inputArray.length; j++) {
					if(inputArray[j].equals(singleword)) { 
						resultArray[resultIndex] = mapArray[j];
						resultIndex++;
						break;
					}
				}
			}
			for(int i = 0; i < resultArray.length; i++) {
				System.out.print(resultArray[i]);
			}
			System.out.println();
		}
	}
}
