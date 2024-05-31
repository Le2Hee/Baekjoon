import java.io.*;
import java.util.*;

public class Main {
	
	static int p, q;
	static int[] count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 탕후루 꼬치의 수
		p = Integer.parseInt(st.nextToken()); // 1분마다 꽂는 딸기의 수
		q = Integer.parseInt(st.nextToken()); // 1분마다 꽂는 샤인머인캣의 수
		count = new int[n];
		
		int[] strawberry = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			strawberry[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] muscat = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			muscat[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			if (!check(strawberry[i], muscat[i], i)) { // 과일이 같아질 수 없다면 NO 출력
				sb.append("NO");
				break;
			}
		}
		
		if (sb.length() == 0) { // 과일이 같아질 수 있다면
			sb.append("YES\n");
			
			for (int i = 0; i < n; i++) {
				sb.append(count[i]).append(" ");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(int s, int m, int index) {
		boolean result = false;
		
		if (p == q || s == m) { // 1분 동안 꽂는 과일이 같으면 s == m일 때에만 가능하기 때문에.
			return s == m;
		}
		
		int num = 0;
		
		// 1분 동안 더 많이 꽂는 과일이 더 크면 같아 질 수 없다.
		while (p > q ? s < m : s > m) {
			num++;
			s += p;
			m += q;
			
			if (s == m) {
				result = true;
				break;
			}
		}
		
		count[index] = num; // 몇 분이 지났는지 저장
		return result;
	}
}