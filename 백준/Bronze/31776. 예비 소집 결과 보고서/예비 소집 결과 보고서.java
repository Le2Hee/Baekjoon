import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 예비 소집에 참요한 팀의 수
		
		int count = 0;
		StringTokenizer st;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken()); // 1번 문제를 해결한 시간
			int t2 = Integer.parseInt(st.nextToken()); // 2번 문제를 해결한 시간
			int t3 = Integer.parseInt(st.nextToken()); // 3번 문제를 해결한 시간
			
			if (t1 != -1) { // 첫번째 문제를 해걀했을 때
				if (t2 == -1 && t3 == -1) { // 나머지 2, 3번 문제를 해결 못했을 때
					count++;
				} else if (t2 != -1) { // 2번 문제를 해결 했을 때
					// 1번 문제보다 2번 문제시간이 같거나 크고, 3번 문제를 안풀었거나 3번 문제 시간이 2번 문제보다 크거나 같을때.
					if ((t1 <= t2) && (t3 == -1 || t2 <= t3)) {
						count++;
					}
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
