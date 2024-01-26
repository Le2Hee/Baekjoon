import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ny = Integer.parseInt(st.nextToken());
		int nm = Integer.parseInt(st.nextToken());
		int nd = Integer.parseInt(st.nextToken());
		
		int fi = ny - y;
		
		if (ny != y) {
			if (nm < m) {
				fi--;
			} else if (nm == m) {
				if (nd < d) {
					fi--;
				}
			}
		}
		
		int se = ny - y + 1;
		int th = ny - y;
		
		sb.append(fi).append("\n").append(se).append("\n").append(th);
		System.out.println(sb);
	}
}