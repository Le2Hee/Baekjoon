import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int add = Integer.parseInt(br.readLine());
		
		int madd = add / 30;
		add = add % 30;
		
		int yadd = madd / 12;
		madd = madd % 12;
		
		y += yadd;
		m += madd;
		d += add;
		
		if (d > 30) {
			d -= 30;
			m++;
		}
		
		if (m > 12) {
			m -= 12;
			y++;
		}
		
		String ms = "0";
		String ds = "0";
		
		if (m < 10) {
			ms += String.valueOf(m);
		} else {
			ms = String.valueOf(m);
		}
		
		if (d < 10) {
			ds += String.valueOf(d);
		} else {
			ds = String.valueOf(d);
		}
		
		sb.append(y).append("-").append(ms).append("-").append(ds);
		System.out.println(sb);
	}
}