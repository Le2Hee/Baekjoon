import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pqu = new PriorityQueue<>(); // 양수
		PriorityQueue<Integer> nqu = new PriorityQueue<>(Collections.reverseOrder()); // 음수
		
		int num;
		while (n-- > 0) {
			num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				if (!pqu.isEmpty() && !nqu.isEmpty()) {
					if (Math.abs(nqu.peek()) <= pqu.peek()) {
						sb.append(nqu.poll());
					} else {
						sb.append(pqu.poll());
					}
				} else if (!pqu.isEmpty() && nqu.isEmpty()) {
					sb.append(pqu.poll());
				} else if (pqu.isEmpty() && !nqu.isEmpty()) {
					sb.append(nqu.poll());
				} else {
					sb.append(0);
				}
				
				sb.append("\n");
			} else {
				if (num > 0) {
					pqu.add(num);
				} else {
					nqu.add(num);
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}