import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ", true);
			
			while (st.hasMoreElements()) {
				StringBuffer sbf = new StringBuffer(st.nextToken());
				sbf.reverse();
				sb.append(sbf);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}