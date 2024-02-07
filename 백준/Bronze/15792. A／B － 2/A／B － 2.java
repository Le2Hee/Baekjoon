import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		sb.append(a / b).append(".");
		int t = 1000;
		a = 10 * (a % b);
		
		while (t-- > 0) {
			sb.append(a / b);
			a = 10 * (a % b);
		}
		
		System.out.println(sb);
	}
}