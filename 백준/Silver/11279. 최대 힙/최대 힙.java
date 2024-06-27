import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 연산의 개수
		
		int num;
		PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
		
		while (n-- > 0) {
			num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				if (qu.isEmpty()) {
					sb.append(0);
				} else {
					sb.append(qu.poll());
				}
				
				sb.append("\n");
			} else {
				qu.offer(num);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}