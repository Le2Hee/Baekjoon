import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken()); // 가로
		int h = Integer.parseInt(st.nextToken()); // 세로
		
		st = new StringTokenizer(br.readLine()); // 개미 위치
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine()); // 시간
		int xt = t;
		
		if (y + t <= h) {
			y = y + t;
		} else {
			t -= (h - y); // y = h
			if (t % h == 0) {
				if ((t / h) % 2 == 0) {
					y = h;
				} else {
					y = 0;
				}
			} else {
				if ((t / h) % 2 == 1) {
					y = (t % h);
				} else {
					y = h - (t % h);
				}
			}
		}
		
		if (x + xt <= w) {
			x = x + xt;
		} else {
			int sum = x + xt;
			xt -= (w - x); // x = w
			if (xt % w == 0) {
				if ((xt / w) % 2 == 0) {
					x = w;
				} else {
					x = 0;
				}
			} else {
				if ((sum / w) % 2 == 1) {
					x = w - (xt % w);
				} else {
					x = (xt % w);
				}
			}
		}
		
		sb.append(x).append(" ").append(y);
		System.out.println(sb);
	}
}