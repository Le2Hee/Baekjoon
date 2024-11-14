import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		// A ~ Z까지의 모든 5자리이진수를 저장합니다.
		Map<String, Character> map = new LinkedHashMap<>();
		map.put("00000", ' ');
		
		for (int i = 0; i < 26; i++) {
			map.put(format(i + 1), (char)('A' + i));
		}
		
		// 계산에 필요한 변수를 선언
		int r, c, dir, index, y, x;
		String s, str;
		char[] arr;
		char[][] grid;
		StringTokenizer st;
		
		// 동서남북 이동을 위한 좌표 설정
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		// 테스트 케이스의 수
		int t = Integer.parseInt(br.readLine()); 
		
		// 테스트 케이스 수만큼 반복
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			arr = st.nextToken().toCharArray();
			
			grid = new char[r][c];		// 입력받은 문자열을 저장하는 그리드
			visit = new boolean[r][c];	// 소용돌이 패턴으로 읽기위한 방문여부
			index = 0; 					// 그리드에 문자열을 넣기 위한 인덱스
			
			// 문자열을 그리드에 저장
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (index < arr.length) {
						grid[i][j] = arr[index];
						index++;
					} else {
						grid[i][j] = '0';
					}
				}
			}
			
			s = "";		// 5자리이진수를 저장하는 문자열
			str = ""; 	// 알파벳으로 변환된 문자열
			dir = 0;	// 0, 1, 2, 3 동서남북 위치 표시
			y = 0;		// 현재 참조하는 y좌표
			x = 0;		// 현재 참조하는 x좌표
			
			// 방문한 곳을 또 방문하면 소용돌이가 끝난 것
			while (check(y, x, r, c)) {
				s += grid[y][x];		// 이진수를 문자열에 저장
				visit[y][x] = true;		// 방문 표시
				
				// 방향전환을 위한 체크
				if (!check(y + dy[dir], x + dx[dir], r, c)) {
					dir++;
					
					if (dir == 4) {
						dir = 0;
					}
				}
				
				// 현재 방향으로 좌표 이동
				y += dy[dir];
				x += dx[dir];
				
				// 5자리가 완성되면 알파벳 문자열 저장
				if (s.length() == 5) {
					str += map.get(s);
					s = "";
				}
			}
			
			// 뒷 빈 공백 제거 후 출력
			str = spaceRemove(str);
			sb.append(str).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 숫자를 5자리이진수로 변환하는 메소드
	private static String format (int num) {
		return String.format("%05d", Integer.parseInt(Integer.toBinaryString(num)));
	}
	
	// 방문 여부와 grid 범위 안인지 체크하는 메소드
	private static boolean check (int y, int x, int r, int c) {
		return 0 <= y && 0 <= x && y < r && x < c && !visit[y][x];
	}
	
	// 완성된 문자열 빈 공백 제거 메소드
	private static String spaceRemove (String s) {
		int index = 0;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				index = i;
				break;
			}
		}
		
		return s.substring(0, index + 1);
	}
}