import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int count = 0;
		int wmax = 0;
		int[] hcount = new int[w];
		int hmax = 0;
		
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			int wc = 0;
			
			for (int j = 0; j < w; j++) {
				int n = check(st.nextToken());
				
				if (n > 0) {
					count += n;
					wc += n;
					hcount[j] += n;
					hmax = Math.max(hcount[j], hmax);
				}
			}
			
			wmax = Math.max(wmax, wc);
		}
		
		count -= Math.max(wmax, hmax);
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int check(String s) {
		int count = 0;
		char[] str = s.toCharArray();
		
		for (int i = 0; i < str.length; i++) {
			if (s.charAt(i) == '9') {
				count++;
			}
		}
		
		return count;
	}
}