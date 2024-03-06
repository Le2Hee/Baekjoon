import java.io.*;
import java.util.*;

public class Main {
	
	static int[] limit, yj;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		limit = new int[101];
		yj = new int[101];
		int now = 1;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			limitFunc(now, now + d, s);
			now += d;
		}
		
		now = 1;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			yjFunc(now, now + d, s);
			now += d;
		}
		
		int max = 0;
		for (int i = 1; i < 101; i++) {
			if (yj[i] > limit[i]) {
				max = Math.max(max, yj[i] - limit[i]);
			}
		}
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void limitFunc(int start, int end, int speed) {
		for (int i = start; i < end; i++) {
			limit[i] = speed;
		}
	}
	
	private static void yjFunc(int start, int end, int speed) {
		for (int i = start; i < end; i++) {
			yj[i] = speed;
		}
	}
}