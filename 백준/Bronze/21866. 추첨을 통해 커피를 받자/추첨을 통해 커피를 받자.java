import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		
		int[] score = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		
		for (int i = 0; i < 9; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (n > score[i]) {
				sb.append("hacker");
				break;
			} else {
				sum += n;
				
				if (sum >= 100) {
					sb.append("draw");
					break;
				}
			}
		}
		
		bw.write(sb.length() == 0 ? "none" : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}