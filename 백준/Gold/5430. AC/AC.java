import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException { // ○
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		char[] p; // 수행할 함수
		int n; // 배열의 길이
		StringTokenizer st; // 입력받은 배열
		Deque<Integer> qu; // 배열을 저장할 큐
		boolean check, filp; // 뒤집기 여부
		
		while (t-- > 0) {
			p = br.readLine().toCharArray();
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "[,] ");
			qu = new LinkedList<>();
			filp = false;
			check = true;
			
			while (st.hasMoreElements()) {
				qu.add(Integer.parseInt(st.nextToken()));
			}
			
			for (int i = 0; i < p.length; i++) {
				if (p[i] == 'R') {
					filp = !filp;
				} else {
					if (!qu.isEmpty()) {
						if (filp) { // 뒤
							qu.pollLast();
						} else { // 앞
							qu.pollFirst();
						}
					} else {
						check = false;
						break;
					}
				}
			}
			
			if (!check) {
				sb.append("error");
			} else {
				sb.append("[");
				
				if (!qu.isEmpty()) {
					sb.append((filp ? qu.pollLast() : qu.pollFirst()));
				}

				while (!qu.isEmpty()) {
					sb.append(",").append((filp ? qu.pollLast() : qu.pollFirst()));
				}
				
				sb.append("]");
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}