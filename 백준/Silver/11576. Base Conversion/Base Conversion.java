import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		Deque<Integer> in = new LinkedList<Integer>();
		
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			in.addFirst(num);
		}
		
		int num = 0;
		for (int i = 0; i < m; i++) {
			num += in.pollFirst() * Math.pow(a, i); // 10
		}
		
		in = new LinkedList<Integer>();
		
		for (int i = num; i > 0; i /= b) {
			in.addFirst(i % b);
		}
		
		while (!in.isEmpty()) {
			sb.append(in.pollFirst()).append(" ");
		}
		
		System.out.println(sb);
	}
}