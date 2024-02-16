import java.io.*;
import java.util.*;

public class Main {
	
	static int count = 0, n;
	static String[] str;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		str = new String[n];
		visit = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				search(str[i]);
			}
		}
		
		bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
	}
	
	private static void search(String s) {
		count++;
		
		for (int i = 0; i < n; i++) {
			if (!visit[i] && s.length() == str[i].length()) {
				for (int j = 0; j < s.length(); j++) {
					StringBuilder sb = new StringBuilder();
					String front = s.substring(0, j + 1);
					String back = s.substring(j + 1, s.length());
					
					sb.append(back).append(front);
					
					if (sb.toString().equals(str[i])) {
						visit[i] = true;
					}
				}
			}
		}
	}
}