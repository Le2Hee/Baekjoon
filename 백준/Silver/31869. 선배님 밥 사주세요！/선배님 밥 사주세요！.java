import java.io.*;
import java.util.*;

public class Main {
	
	// 메모를 저장하기 위한 클래스
	public static class Memo {
		int week, day, price;
		
		public Memo(int w, int d, int p) {
			week = w;
			day = d;
			price = p;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 기록의 수
		
		StringTokenizer st;
		Map<String, Memo> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken(); // 선배의 이름
			int w = Integer.parseInt(st.nextToken()); // 선배를 만나는 주차
			int d = Integer.parseInt(st.nextToken()); // 선배를 만나는 요일
			int p = Integer.parseInt(st.nextToken()); // 약속에 드는 비용
			
			map.put(s, new Memo(w, d, p));
		}
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken(); // 선배의 이름
			int m = Integer.parseInt(st.nextToken()); // 선배가 소지한 돈
			
			if (map.get(s).price > m) { // 선배가 살 수 없다면 삭제
				map.remove(s);
			}
		}
		
		boolean[][] visit = new boolean[11][7];
		for (String s : map.keySet()) { // 얻어 먹을 수 있는 날짜는 true로 변경
			visit[map.get(s).week][map.get(s).day] = true;
		}
		
		int max = 0;
		int count = 0;
		
		// 최대값 구하기
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < 7; j++) {
				if (visit[i][j]) {
					count++;
				} else if (count != 0) {
					max = Math.max(max, count);
					count = 0;
				}
			}
		}
		
		// 마지막까지 0이 안나오면 max값을 계산을 안하기 때문에, 한번 더 계산
		max = Math.max(max, count);
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
}