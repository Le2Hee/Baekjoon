import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 개수
		int l = Integer.parseInt(st.nextToken()); // 테이프의 길이
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		
		while (n-- > 0) {
			q.add(Integer.parseInt(st.nextToken()));
		}
		
		int count = 1;
		int start = q.poll();
		int now;
		
		while (!q.isEmpty()) {
			now = q.poll();
			
			if (now - start > l - 1) {
				count++;
				start = now;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}