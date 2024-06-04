import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 학생 수
		int k = Integer.parseInt(st.nextToken()); // 확인하는 인원 수
		
		Queue<Integer> qu = new LinkedList<>(); // 학생을 저장할 큐
		
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			qu.add(Integer.parseInt(st.nextToken()));
		}
		
		Deque<Integer> sub = new LinkedList<>();
		int count = 0, num, size;
		while (true) {
			count++;
			num = 0;
			size = qu.size();
			
			while (sub.size() < k) {
				if (qu.size() == 0) {
					break;
				}
				
				num = qu.poll();
				
				if (num == 1) {
					sub.addFirst(num);
				 } else {
					 sub.addLast(num);
				 }
			}
			
			if (sub.peekFirst() == sub.peekLast()) {
				sub.pollFirst();
			} else {
				sub.pollFirst();
				sub.pollLast();
			}
			
			if (sub.size() == 0 && qu.size() == 0) {
				break;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}