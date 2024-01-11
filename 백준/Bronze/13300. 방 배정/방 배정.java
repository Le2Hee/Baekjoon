import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		double k = Double.parseDouble(st.nextToken());
		
		int[] m = new int[6];
		int[] g = new int[6];
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			if (s == 0) {
				g[num]++;
			} else {
				m[num]++;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 6; i++) {
			count += Math.ceil(g[i] / k);
			count += Math.ceil(m[i] / k);
		}
		
		sb.append(count);
		System.out.println(count);
	}
}