import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // KPSC 동아리원의 수
		int m = Integer.parseInt(st.nextToken()); // 일별 활동 기록의 길이
		
		int count = 0; // 리버스 스트릭 총 개수
		boolean[] check = new boolean[m + 1]; // 리버스 스트릭 개수 체크
		
		int c, max;
		char s;
		String name;
		
		// 리버스 스트릭 개수를 입력받고 이름을 출력하기 위한 sub StringBuilder
		StringBuilder subSb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			max = 0; // 최장 리버스 스트릭
			c = 0; // 리버스 스트릭 개수
			
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) { // 일별 활동 기록의 길이 만큼 반복
				s = st.nextToken().charAt(0);
				
				if (s == '.') {
					c++;
					max = Math.max(max, c);
				} else {
					c = 0;
				}
			}
			
			name = st.nextToken();
			
			// 리버스 스트릭 총 개수를 위한 체크
			check[max] = true;
			
			// 최장 리버스 스트릭과 이름을 출력
			subSb.append(max).append(" ").append(name).append("\n");
		}
		
		// 리버스 스트릭 개수 측정
		for (int i = 0; i <= m; i++) {
			if (check[i]) {
				count++;
			}
		}
		
		sb.append(count).append("\n").append(subSb.toString());
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}