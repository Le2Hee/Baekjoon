import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder str;
		
		while (n-- > 0) {
			str = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			str.append(st.nextElement());
			str.replace(num - 1, num, "");
			sb.append(str.toString()).append("\n");
		}
		
		System.out.println(sb);
	}
}