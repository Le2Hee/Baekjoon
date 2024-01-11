import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if (m == 1 || m == 2) {
			sb.append("NEWBIE!");
		} else if (m <= n) {
			sb.append("OLDBIE!");
		} else {
			sb.append("TLE!");
		}
		
		System.out.println(sb);
	}
}