import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int nowh = Integer.parseInt(st.nextToken());
		int nowm = Integer.parseInt(st.nextToken());
		int nows = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ":");
		int doh = Integer.parseInt(st.nextToken()) + 24;
		int dom = Integer.parseInt(st.nextToken());
		int dos = Integer.parseInt(st.nextToken());
		
		int h, m, s;
		
		if (dos < nows) {
			dos += 60;
			
			if (dom != 0) {
				dom--;
			} else {
				dom += 59;
				doh--;
			}
		}
		s = dos - nows;
		
		if (dom < nowm) {
			dom += 60;
			doh--;
		}
		m = dom - nowm;
		h = doh - nowh;
		
		String strh, strm, strs;
		
		if (h < 10) {
			strh = "0" + String.valueOf(h);
		} else if (h >= 24) {
			h -= 24;
			if (h < 10) {
				strh = "0" + String.valueOf(h);
			} else {
				strh = String.valueOf(h);
			}
		}
		else {
			strh = String.valueOf(h);
		}
		
		if (m < 10) {
			strm = "0" + String.valueOf(m);
		} else {
			strm = String.valueOf(m);
		}
		
		if (s < 10) {
			strs = "0" + String.valueOf(s);
		} else {
			strs = String.valueOf(s);
		}
		
		sb.append(strh).append(":").append(strm).append(":").append(strs);
		System.out.println(sb);
	}
}