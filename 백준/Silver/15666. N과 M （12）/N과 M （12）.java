import java.io.*;
import java.util.*;

public class Main {
	
	static int m;
	static int[] str;
	static List<Integer> list;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 자연수의 개수
		m = Integer.parseInt(st.nextToken()); // 수열의 길이
		
		TreeSet<Integer> set = new TreeSet<>(); // 수를 저장할 set (중복 제거)
		str = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		// 중복이 제거된 수를 list로 변환
		list = new LinkedList<>();
		set.forEach(num -> list.add(num));
		
		// 함수 호출
		function(0, 0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int index, int len) {
		if (len == m) { // 길이가 같다면 출력
			for (int i = 0; i < m; i++) {
				sb.append(str[i]).append(" ");
			}
			sb.append("\n");
			
		} else { // 같지 않다면 다음 인덱스 수를 설정
			for (int i = index; i < list.size(); i++) {
				str[len] = list.get(i);
				function(i, len + 1);
			}
		}
	}
}