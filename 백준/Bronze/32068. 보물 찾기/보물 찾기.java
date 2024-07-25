import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int l, r, s, num;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken()); // 왼쪽 보물
			r = Integer.parseInt(st.nextToken()); // 오른쪽 보물
			s = Integer.parseInt(st.nextToken()); // 현재 위치
			num = 1; // 이동 거리
			
			for (int i = 0; ; i++) {
				if (i % 2 == 0) { // 짝수이면 오른쪽 이동
					s += num;
				} else { // 홀수이면 왼쪽 이동
					s -= num;
				}
				
				// 보물을 찾았다면
				if (s == l || s == r) {
					break;
				} else {
					num++;
				}
			}
			
			// 첫 위치에서 조사를 하기 때문에 +1
			sb.append(num + 1).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}