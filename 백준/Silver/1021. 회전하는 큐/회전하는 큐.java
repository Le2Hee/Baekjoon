import java.io.*;
import java.util.*;

public class Main {
	
	static Deque<Integer> qu;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 큐의 크기
		int m = Integer.parseInt(st.nextToken()); // 봅아내려고 하는 수의 개수
		
		qu = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			qu.addLast(i);
		}
		
		int num, count = 0;
		st = new StringTokenizer(br.readLine());
		while (m-- > 0) {
			num = Integer.parseInt(st.nextToken());
			
			if (qu.peekFirst() == num) { // 맨 앞에 있을 경우 연산이 필요없다.
				qu.pollFirst();
			} else if (qu.peekLast() == num) { // 맨 뒤에 있을 경우 맨 앞으로 1번 옮기고 제거한다.
				count++;
				qu.pollLast();
			} else { // 맨 앞또는 맨 뒤에 없을 경우
				if (front(num) > back(num)) { // 뒤에서 앞으로 보내는게 더 연산이 적을경우
					while (true) {
						count++;
						qu.addFirst(qu.pollLast());
						
						if (qu.peekFirst() == num) {
							qu.pollFirst();
							break;
						}
					}
				} else { // 앞에서 뒤로 보내는게 더 연산이 적을 경우
					while (true) {
						count++;
						qu.addLast(qu.pollFirst());
						
						if (qu.peekFirst() == num) {
							qu.pollFirst();
							break;
						}
					}
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 앞에서 뒤로 보냈을 때 참조하는 숫자가 나오는 횟수를 구하는 함수
	private static int front(int num) {
		int count = 0;
		Deque<Integer> sub = new LinkedList<>();
		
		while (!qu.isEmpty()) {
			count++;
			sub.add(qu.pollFirst());
			
			if (qu.peekFirst() == num) {
				break;
			}
		}
		
		// 뺀 수열을 다시 넣어준다.
		while (!sub.isEmpty()) {
			qu.addFirst(sub.pollLast());
		}
		
		return count;
	}
	
	// 뒤에서 앞으로 보냈을 때 참조하는 숫자가 나오는 횟수를 구하는 함수
	private static int back(int num) {
		int count = 0;
		Deque<Integer> sub = new LinkedList<>();
		
		while (!qu.isEmpty()) {
			count++;
			sub.add(qu.pollLast());
			
			if (sub.peekLast() == num) {
				break;
			}
		}
		
		// 뺀 수열을 다시 넣어준다.
		while (!sub.isEmpty()) {
			qu.addLast(sub.pollLast());
		}
		
		return count;
	}
}