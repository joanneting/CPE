package tw.com.ntub.uva10252;
import java.util.Scanner;
public class CommonPermutation {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String firstWord = input.nextLine().toLowerCase();
			String secondWord = input.nextLine().toLowerCase();
			int[] repeatWord = new int[26];
			for(int i = 0; i < 26; i++) {
				repeatWord[i]=0;
			}
			for(int i = 0; i < firstWord.length(); i++) {
				String singleWord = Character.toString(firstWord.charAt(i));
				int index = firstWord.charAt(i)-'a';
				int wordIndex = secondWord.indexOf(singleWord);
				if(secondWord.contains(singleWord)) {
					secondWord = secondWord.substring(0,wordIndex)+secondWord.substring(wordIndex+1);
					repeatWord[index]++;
				}
			}
			
			for(int i = 0; i < 26; i++) {
				for(int j = 0; j < repeatWord[i]; j++)
					System.out.print((char)('a'+i));
				
			}
			System.out.println();
		}
	}
}
