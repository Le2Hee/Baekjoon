import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if (d <= 11 && h < 11) {
			sb.append(-1);
		} else {
			if (m < 11) {
				m += 49;
				h--;
			} else {
				m -= 11;
			}
			
			if (h < 11) {
				d--;
				h += 13;
			} else {
				h -= 11;
			}
			
			d -= 11;
			
			int sum = m;
			sum += h * 60;
			sum += d * 24 * 60;
			if (sum >= 0) {
				sb.append(sum);
			} else {
				sb.append(-1);
			}
		}
		
		System.out.println(sb);
	}
}
