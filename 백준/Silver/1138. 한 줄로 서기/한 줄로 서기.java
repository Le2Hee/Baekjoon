import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] value = new int[n + 1];
		Deque<Integer> qu = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		qu.addFirst(n);
		
		for (int i = n - 1; i > 0; i--) {
			int val = value[i];
			Deque<Integer> sub = new LinkedList<Integer>();
			
			for (int j = 0; j < val; j++) {
				sub.addLast(qu.pollFirst());
			}
			
			qu.addFirst(i);
			
			for (int j = 0; j < val; j++) {
				qu.addFirst(sub.pollLast());
			}
		}
		
		for (int num : qu) {
			sb.append(num).append(" ");
		}
		
		System.out.println(sb);
	}
}