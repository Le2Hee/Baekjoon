import java.io.*;
import java.util.*;

public class Main {
	
	public static class Time {
		int start, end;
		
		public Time (int s, int e) {
			start = s;
			end = e;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		Time[] time = new Time[t];
		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			time[i] = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(time, (o1, o2) -> o1.end - o2.end == 0 ? o1.start - o2.start : o1.end - o2.end);
		
		int count = 0;
		int now = 0;
		
		for (int i = 0; i < t; i++) {
			if (now <= time[i].start) {
				now = time[i].end;
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}