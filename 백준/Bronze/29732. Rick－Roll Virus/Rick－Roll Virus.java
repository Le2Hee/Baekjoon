import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 사람의 수
		int m = Integer.parseInt(st.nextToken()); // 치료제의 개수
		int k = Integer.parseInt(st.nextToken()); // 감염 범위
		
		int sum = 0;
		char[] people = br.readLine().toCharArray();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			if (people[i] == 'R') {
				sum++;
				q.add(i);
			}
		}
		
		int index;
		while (!q.isEmpty()) {
			index = q.poll();
			
			for (int i = index + 1; i <= index + k; i++) {
				if (i >= n) {
					break;
				}
				
				if (people[i] == '.') {
					sum++;
					people[i] = 'R';
				}
			}
			
			for (int i = index - 1; i >= index - k; i--) {
				if (i < 0) {
					break;
				}
				
				if (people[i] == '.') {
					sum++;
					people[i] = 'R';
				}
			}
		}
		
		if (sum <= m) {
			sb.append("Yes");
		} else {
			sb.append("No");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}