import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] u = new int[9];
		int[] s = new int[9];
		
		StringTokenizer ust = new StringTokenizer(br.readLine());
		StringTokenizer sst = new StringTokenizer(br.readLine());
		
		int ucount = 0;
		int scount = 0;
		
		for (int i = 0; i < 9; i++) {
			u[i] = Integer.parseInt(ust.nextToken());
			s[i] = Integer.parseInt(sst.nextToken());
			
			ucount += u[i];
			
			if (ucount > scount) {
				if (sb.length() == 0) {
					sb.append("Yes");
				}
			}
			
			scount += s[i];
		}
		
		if (sb.length() == 0) {
			sb.append("No");
		}
		
		System.out.println(sb);
	}
}