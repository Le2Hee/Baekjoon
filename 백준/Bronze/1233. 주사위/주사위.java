import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] count = new int[81];
		int max = 0;
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					count[i + j + k]++;
					max = Math.max(max, count[i + j + k]);
				}
			}
		}
		
		for (int i = 3; i < 81; i++) {
			if (count[i] == max) {
				sb.append(i);
				break;
			}
		}
		
		System.out.println(sb);
	}
}