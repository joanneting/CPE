package tw.com.ntub.uva10420;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class ListOfConquests {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int line = Integer.valueOf(input.nextLine());
		Map<String,Integer> countryMap = new TreeMap<>();
		for(int i=0;i<line;i++) {
			String data = input.nextLine().trim();
			String country = data.split(" ")[0];
			if(countryMap.containsKey(country)) {
				countryMap.put(country, countryMap.get(country)+1);				
			}else {
				countryMap.put(country,1);				
			}			
		}
		for(Object key : countryMap.keySet()) {
			System.out.println(key+" "+countryMap.get(key));
		}
	}
}
