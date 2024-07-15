import java.io.*;
import java.util.*;

public class Main {
	
	static int n, m;
	static int[] str;
	static List<Integer> list;
	static Set<String> set = new LinkedHashSet<>();
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 자연수의 개수
		m = Integer.parseInt(st.nextToken()); // 수열의 길이
		
		str = new int[m];
		list = new LinkedList<>();
		visit = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		// 함수 호출
		function(0);
		
		set.forEach(s -> sb.append(s).append("\n"));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 수열을 만들어 문자열로 출력해주는 함수.
	private static void function(int len) {
		if (len == m) { // 길이가 같다면 출력
			StringBuilder sub = new StringBuilder();
			
			for (int i = 0; i < m; i++) {
				sub.append(str[i]).append(" ");
			}
			
			set.add(sub.toString());
			
		} else { // 같지 않다면 다음 인덱스 수를 설정
			for (int i = 0; i < n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					str[len] = list.get(i);
					function(len + 1);
					visit[i] = false;
				}
			}
		}
	}
}