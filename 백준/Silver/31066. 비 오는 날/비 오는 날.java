import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int n, m, k, count;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); // 창의인재관에 있는 학생 수
			m = Integer.parseInt(st.nextToken()); // 창의인재관에 있는 우산 수
			k = Integer.parseInt(st.nextToken()); // 하나의 우산 최대 인원 수 
			
			// 모든 학생이 융합인재관으로 갈 수 없다면
			if (n != 1 && m == 1 && k == 1) {
				sb.append(-1).append("\n");
				continue;
			}
			
			count = 0;
			while (true) {
				count++;
				n -= m * k;
				
				if (n <= 0) { // 모든 인원이 이동하면 break
					break;
				} else { // 한 명이 다시 창의인재관을 이동
					count++;
					n++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}