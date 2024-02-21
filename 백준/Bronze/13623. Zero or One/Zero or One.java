import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] num = new boolean[3];
		int tc = 0;
		int fc = 0;
		
		for (int i = 0; i < 3; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if (n == 1) {
				num[i] = true;
				tc++;
			} else {
				num[i] = false;
				fc++;
			}
		}
		
		if (tc == 1) {
			for (int i = 0; i < 3; i++) {
				if (num[i]) {
					sb.append((char)(i + 'A'));
				}
			}
		} else if (fc == 1) {
			for (int i = 0; i < 3; i++) {
				if (!num[i]) {
					sb.append((char)(i + 'A'));
				}
			}
		} else {
			sb.append("*");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
