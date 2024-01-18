import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] count = new int[123];
		String str = "";
		int max = Integer.MIN_VALUE;
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i)]++;
				if (str.charAt(i) >= 97) {
					max = Math.max(max, count[str.charAt(i)]);
				}
			}
		}
		
		List<String> list = new LinkedList<>();
		
		for (int i = 97; i <= 122; i++) {
			if (count[i] == max) {
				char c = (char)i;
				list.add(String.valueOf(c));
			}
		}
		
		Collections.sort(list);
		
		for (String s : list) {
			sb.append(s);
		}
		
		System.out.println(sb);
	}
}