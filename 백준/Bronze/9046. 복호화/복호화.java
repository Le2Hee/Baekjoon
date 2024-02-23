import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		char c;
		char[] str;
		int[] count;
		int max;
		while (t-- > 0) {
			c = ' ';
			count = new int[26];
			str = br.readLine().toCharArray();
			max = 0;
			
			for (int i = 0; i < str.length; i++) {
				if (str[i] != ' ') {
					count[str[i] - 'a']++;
					max = Math.max(count[str[i] - 'a'], max);
				}
			}
			
			int num = 0;
			int index = 0;
			for (int i = 0; i < 26; i++) {
				if (count[i] == max) {
					index = i;
					num++;
				}
			}
			
			if (num == 1) {
				sb.append((char)(index + 'a')).append("\n");
			} else {
				sb.append("?\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}