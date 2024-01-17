import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		if (s + k + h >= 100) {
			sb.append("OK");
		} else {
			int min = Math.min(s, k);
			min = Math.min(min, h);
			
			if (min == s) {
				sb.append("Soongsil");
			} else if (min == k) {
				sb.append("Korea");
			} else {
				sb.append("Hanyang");
			}
		}
		
		System.out.println(sb);
	}
}