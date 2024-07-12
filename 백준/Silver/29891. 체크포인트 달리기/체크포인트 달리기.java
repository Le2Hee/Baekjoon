import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 체크포인트의 개수
		int k = Integer.parseInt(st.nextToken()); // 한 번에 체크가능한 포인트 개수
		
		PriorityQueue<Integer> pos = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> neg = new PriorityQueue<>();
		int num;
		
		while (n-- > 0) {
			num = Integer.parseInt(br.readLine());
			
			if (num > 0) {
				pos.add(num);
			} else {
				neg.add(num);
			}
		}
		
		long result = 0;
		int together;
		
		// 양수 체크포인트
		while (!pos.isEmpty()) {
			result += pos.peek() * 2;
			together = k;
			
			while (!pos.isEmpty() && together-- > 0) {
				pos.poll();
			}
		}
		
		// 음수 체크포인트
		while (!neg.isEmpty()) {
			result += Math.abs(neg.peek()) * 2;
			together = k;
			
			while (!neg.isEmpty() && together-- > 0) {
				neg.poll();
			}
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}