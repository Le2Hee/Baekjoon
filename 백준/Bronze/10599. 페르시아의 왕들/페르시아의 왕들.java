import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0 0 0 0")) {
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int min = c - b;
			int max = d - a;
			
			sb.append(min).append(" ").append(max).append("\n");
		}
		
		System.out.println(sb);
	}
}
