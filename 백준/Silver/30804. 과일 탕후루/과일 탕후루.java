import java.io.*;
import java.util.*;

public class Main {
	
	static int max, n;
	static Queue<Integer> fruit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine()); // 과일의 개수
		StringTokenizer st = new StringTokenizer(br.readLine()); // 과일들
		max = 0;
		
		// 과일을 저장하는 배열
		fruit = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			fruit.add(Integer.parseInt(st.nextToken()));
		}
		
		function();
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function() {
		Deque<Integer> qu = new LinkedList<>();
		int[] count = new int[10];
		boolean[] check = new boolean[10];
		
		while (!fruit.isEmpty()) {
			qu.add(fruit.poll());
			
			count[qu.peekLast()]++;
			check[qu.peekLast()] = true;
			
			if (check(check)) {
				max = Math.max(max, qu.size());
			} else {
				int num = 0;
				
				while (true) {
					num = qu.pollFirst();
					
					count[num]--;
					
					if (count[num] == 0) {
						check[num] = false;
						break;
					}
				}
			}
		}
	}
	
	private static boolean check(boolean[] c) {
		int count = 0;
		
		for (int i = 1; i < 10; i++) {
			if (c[i]) {
				count++;
			}
			
			if (count > 2) {
				break;
			}
		}
		
		return count > 2 ? false : true;
	}
}