import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int nh = Integer.parseInt(st.nextToken());
		int nm = Integer.parseInt(st.nextToken());
		int ns = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ":");
		int eh = Integer.parseInt(st.nextToken());
		int em = Integer.parseInt(st.nextToken());
		int es = Integer.parseInt(st.nextToken());
		
		if (nh > eh) {
			int s = 60 - ns;
			nm++;
			
			int m = 60 - nm;
			nh++;
			
			int h = 24 - nh;
			
			h += eh;
			m += em;
			s += es;
			
			if (s >= 60) {
				m++;
				s = s % 60;
			}
			
			if (m >= 60) {
				h++;
				m = m % 60;
			}
			
			if (h < 0) {
				h += 24;
			}
			
			sb.append(format(h, m, s));
		} else {
			int h = eh - nh;
			int m = em - nm;
			int s = es - ns;
			
			if (s < 0) {
				m--;
				s += 60;
			}
			
			if (m < 0) {
				h--;
				m += 60;
			}
			
			if (s >= 60) {
				m++;
				s = s % 60;
			}
			
			if (m >=60) {
				h++;
				m = m % 60;
			}

			if (h < 0) {
				h += 24;
			}
			
			sb.append(format(h, m, s));
		}
		
		System.out.println(sb);
	}
	
	private static String format(int h, int m, int s) {
		String sh = "0";
		String sm = "0";
		String ss = "0";
		
		if (h == 0 && m == 0 && s == 0) {
			h = 24;
		}
		
		if (h < 10) {
			sh += String.valueOf(h);
		} else {
			sh = String.valueOf(h);
		}
		
		if (m < 10) {
			sm += String.valueOf(m);
		} else {
			sm = String.valueOf(m);
		}
		
		if (s < 10) {
			ss += String.valueOf(s);
		} else {
			ss = String.valueOf(s);
		}
		
		return sh + ":" + sm + ":" + ss;
	}
}
