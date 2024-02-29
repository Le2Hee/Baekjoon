import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int h1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int s1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ":");
		int h2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		
		int h = h2 - h1;
		int m = m2 - m1;
		int s = s2 - s1;
		
		if (s < 0) {
			s += 60;
			m--;
		}
		
		if (m < 0) {
			m += 60;
			h--;
		}
		
		if (h < 0) {
			h += 24;
		}
		
		String hs, ms, ss;
		
		if (h < 10) {
			hs = "0" + h;
		} else {
			hs = String.valueOf(h);
		}
		
		if (m < 10) {
			ms = "0" + m;
		} else {
			ms = String.valueOf(m);
		}
		
		if (s < 10) {
			ss = "0" + s;
		} else {
			ss = String.valueOf(s);
		}
		
		sb.append(hs).append(":").append(ms).append(":").append(ss);
		
		if (sb.toString().equals("00:00:00")) {
			sb = new StringBuilder();
			sb.append("24:00:00");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}