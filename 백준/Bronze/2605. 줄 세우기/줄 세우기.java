import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		q.add(1);
		
		for (int i = 2; i <= n; i++) {
			Deque<Integer> sub = new LinkedList<>();
			num = Integer.parseInt(st.nextToken());
			
			while (num-- > 0) {
				sub.addFirst(q.pollLast());
			}
			
			q.add(i);
			
			while (!sub.isEmpty()) {
				q.add(sub.poll());
			}
		}
		
		for (int m : q) {
			sb.append(m).append(" ");
		}
		
		System.out.println(sb);
	}
}
