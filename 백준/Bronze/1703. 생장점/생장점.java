import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		StringTokenizer st;
		int sum;
		
		while (!(s = br.readLine()).equals("0")) {
			sum = 1;
			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			
			for (int i = 0; i < n; i++) {
				sum *= Integer.parseInt(st.nextToken());
				sum -= Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}