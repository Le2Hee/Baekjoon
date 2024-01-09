import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 1; i <= t; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			sum += o + w;
			print(i, sum);
		}
		
		System.out.println(sb);
	}
	
	private static void print(int i, int sum) {
		sb.append("Case ").append(i).append(": ").append(sum).append("\n");
	}
}