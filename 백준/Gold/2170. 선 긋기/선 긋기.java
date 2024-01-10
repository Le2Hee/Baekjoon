import java.io.*;
import java.util.*;

public class Main {
	
	static class Line implements Comparable<Line> {
		int x, y;
		
		public Line (int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int compareTo(Line o) {
			if(this.x == o.x)	//시작 위치가 같을 때 끝 위치 내림차순
                return o.y - this.y;
            return this.x - o.x; // 오름차순
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Line> pq = new PriorityQueue<>();
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			pq.offer(new Line(start, end));
		}
		Line line = pq.poll();
		int result = 0;
		int start = line.x;
        int end = line.y;
        
        while (!pq.isEmpty()) {
        	Line sub = pq.poll();
        	
        	if (sub.x > end) {
        		result += end - start;
        		start = sub.x;
        		end = sub.y;
        		continue;
        	}
        	
        	if (sub.y > end) {
        		end = sub.y;
        	}
        }
        result += end - start;
        sb.append(result);
		System.out.println(sb);
	}
}