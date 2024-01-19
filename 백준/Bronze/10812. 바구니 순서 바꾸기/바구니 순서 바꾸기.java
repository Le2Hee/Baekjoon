import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Queue<Integer> list = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		Queue<Integer> front;
		Queue<Integer> back;
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			int min = Integer.parseInt(st.nextToken()) - 1;
			
			front = new LinkedList<Integer>();
			back = new LinkedList<Integer>();
			
			for (int i = 0; i < n; i++) {
				if (i < start) {
					front.offer(list.poll());
				} else if (i >= start && i < min) {
					back.offer(list.poll());
				} else if (i >= min && i <= end) {
					front.offer(list.poll());
				} else {
					back.offer(list.poll());
				}
			}
			
			while (!front.isEmpty()) {
				list.offer(front.poll());
			}
			
			while (!back.isEmpty()) {
				list.offer(back.poll());
			}
		}
		
		for (int num : list) {
			sb.append(num).append(" ");
		}
		
		System.out.println(sb);
	}
}