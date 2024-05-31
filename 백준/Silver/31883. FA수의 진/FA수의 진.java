import java.io.*;
import java.util.*;

public class Main {
	
	public static class Line {
		int crosswalk, overpass, green, red, total;
		
		public Line(int c, int o, int g, int r, int t) {
			crosswalk = c;
			overpass = o;
			green = g;
			red = r;
			total = t;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 횡단보도의 수
		
		StringTokenizer st;
		Line[] arr = new Line[n];
		int c, o, g, r, t;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken()); // 횡단보도
			o = Integer.parseInt(st.nextToken()); // 육교
			g = Integer.parseInt(st.nextToken()); // 녹색 신호등
			r = Integer.parseInt(st.nextToken()); // 적색 신호등
			t = g + r; // 신호등이 도는 사이클 시간
			
			arr[i] = new Line(c, o, g, r, t);
		}
		
		int signal;
		int count = arr[0].crosswalk > arr[0].overpass ? arr[0].overpass : arr[0].crosswalk; // 첫 번째 길은 둘 중에 적은 곳으로 건넌다.
		for (int i = 1; i < n; i++) {
			signal = count % arr[i].total;
			
			if (signal < arr[i].green) { // 녹색불일때
				if (arr[i].overpass < arr[i].crosswalk) {
					// 녹색이지만 육교가 더 짧을 때.
					count += arr[i].overpass;
				} else {
					// 횡단보도가 더 짧을 때
					count += arr[i].crosswalk;
				}
			} else { // 적색불일때
				if (arr[i].total - 1 - signal + arr[i].crosswalk < arr[i].overpass) {
					// 적색이지만 적색을 기다리고 횡단보도를 건너는 시간이 육교보다 짧을 때.
					count += arr[i].total - signal + arr[i].crosswalk;
				} else {
					// 육교가 더 짧을 때
					count += arr[i].overpass;
				}
			}
			
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}