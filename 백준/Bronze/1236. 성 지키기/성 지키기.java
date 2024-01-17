import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] map = new String[n];
		boolean[] h = new boolean[m];
		int wcount = 0;
		int hcount = 0;
		
		for (int i = 0; i < n; i++) {
			map[i] = br.readLine();
		}
		
		boolean bo;
		
		for (int i = 0; i < n; i++) {
			bo = false;
			for (int j = 0; j < m; j++) {
				if (map[i].charAt(j) == 'X') {
					bo = true;
					h[j] = true;
				}
			}
			
			if (!bo) {
				wcount++;
			}
		}
		
		for (boolean b : h) {
			if(!b) {
				hcount++;
			}
		}
		
		sb.append(Math.max(wcount, hcount));
		System.out.println(sb);
	}
}