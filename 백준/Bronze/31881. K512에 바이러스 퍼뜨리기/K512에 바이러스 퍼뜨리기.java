import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 비치된 컴퓨터 개수
		int q = Integer.parseInt(st.nextToken()); // 쿼리의 개수
		
		// 컴퓨터 감염 여부 (true : 감염, false : 비감염)
		boolean[] visit = new boolean[n + 1]; 
		int count = n; // 감염되지 않은 컴퓨터 개수
		
		int number, x;
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			number = Integer.parseInt(st.nextToken());
			
			switch (number) {
			case 1:
				x = Integer.parseInt(st.nextToken());
				
				if (!visit[x]) {
					count--;
				}
				
				visit[x] = true; // 감염시킨다.
				break;
			case 2:
				x = Integer.parseInt(st.nextToken());
				
				if (visit[x]) {
					count++;
				}
				
				visit[x] = false; // 치료한다.
				break;
			case 3: // 감염되지 않은 컴퓨터 개수를 출력한다.
				sb.append(count).append("\n");
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}