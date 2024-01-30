import java.io.*;
import java.util.*;

public class Main {
	
	static Deque<Integer> line;
	static int index = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Deque<Integer> sub;
		int n, count;
		
		while (t-- > 0) {
			line = new LinkedList<Integer>();
			sub = new LinkedList<Integer>();
			count = 0;
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			sb.append(n).append(" ");
			
			n = Integer.parseInt(st.nextToken());
			line.addFirst(n);
			
			while (st.hasMoreElements()) {
				n = Integer.parseInt(st.nextToken());
				
				if (check(n)) {
					for (int i = 0; i < index; i++) {
						sub.addLast(line.pollLast());
					}
					
					count += index;
					line.addLast(n);
					
					while (!sub.isEmpty()) {
						line.addLast(sub.pollLast());
					}
				} else {
					line.addLast(n);
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static boolean check(int n) {
		boolean bo = false;
		List<Integer> list = new LinkedList<>(line);
		index = 0;
		
		for (int m : list) {
			if (m > n) {
				index++;
				bo = true;
			}
		}
		
		return bo;
	}
}
