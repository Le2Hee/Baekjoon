import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] count;
		char[] arr;
		int min;
		
		for (int i = 1; i <= t; i++) {
			min = Integer.MAX_VALUE;
			count = new int[26];
			arr = br.readLine().toCharArray();
			
			for (int j = 0; j < arr.length; j++) {
				char c = arr[j];
				
				if (Character.isLowerCase(c)) {
					count[c - 'a']++;
				} else if (Character.isUpperCase(c)) {
					count[c - 'A']++;
				}
			}
			
			for (int j = 0; j < 26; j++) {
				min = Math.min(min, count[j]);
			}
			
			if (min == 0) {
				sb.append("Case ").append(i).append(": Not a pangram\n");
			} else if (min == 1) {
				sb.append("Case ").append(i).append(": Pangram!\n");
			} else if (min == 2) {
				sb.append("Case ").append(i).append(": Double pangram!!\n");
			} else {
				sb.append("Case ").append(i).append(": Triple pangram!!!\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}