import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreElements()) {
			int num = Integer.parseInt(st.nextToken());
			
			if (n == num) {
				count++;
			}
		}
		
		sb.append(count);
		System.out.println(sb);
	}
}