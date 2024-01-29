import java.io.*;
import java.util.*;

public class Main {
	
	static String love = "LOVE";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String y = br.readLine();
		int[] ycount = new int[4];
		
		for (int i = 0; i < y.length(); i++) {
			int index = index(y.charAt(i));
			
			if (index != -1) {
				ycount[index]++;
			}
		}
		
		int[] count;
		int n = Integer.parseInt(br.readLine());
		String[] names = new String[n];
		String name = "";
		Map<String, Integer> list = new LinkedHashMap<>();
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			name = br.readLine();
			names[i] = name;
			
			count = new int[4];
			
			for (int j = 0; j < 4; j++) {
				count[j] += ycount[j];
			}
			
			for (int j = 0; j < name.length(); j++) {
				int index = index(name.charAt(j));
				
				if (index != -1) {
					count[index]++;
				}
			}
			
			Map<String, Integer> map = new LinkedHashMap<>();
			list.put(name, probability(count));
			max = Math.max(probability(count), max);
		}
		
		List<String> key = new LinkedList<>(list.keySet());
		Collections.sort(key);
		
		for (String ss : key) {
			if (max == list.get(ss)) {
				System.out.println(ss);
				break;
			}
		}
	}
	
	private static int index(char c) {
		int result = -1;
		
		for (int i = 0; i < 4; i++) {
			if (love.charAt(i) == c) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	private static int probability(int[] c) {
		int result = 1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				result *= (c[i] + c[j]);
			}
		}
		
		result %= 100;
		return result;
	}
}