import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dxy = {0, 1, 2, 3};
	static Map<Integer, Integer> map = new LinkedHashMap<>(); // x좌표를 키 y좌표를 값으로 설정
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int q = Integer.parseInt(br.readLine()); // 쿼리의 개수
		
		int number, x;
		StringTokenizer st;
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			number = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			
			switch (number) {
			case 1: // 1 x 4 블럭이 들어왔을 때
				int y = xcheck(x); // 이미 쌓아진 블럭이 있는지 체크
				xinput(x, y);
				break;
			case 2: // 4 x 1 블럭이 들어왔을때
				if (map.containsKey(x)) { // 이미 쌓아진 블럭이 있다면
					map.put(x, map.get(x) + 4);
				} else { // 쌓아진 블럭이 없다면
					map.put(x, 4);
				}
				
				break;
			case 3: // x좌표에서 가장 높은 y좌표를 출력
				if (map.containsKey(x)) { // 존재한다면
					sb.append(map.get(x)).append("\n");
				} else { // 존재하지 않는다면
					sb.append(0).append("\n");
				}
				
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 1 x 4 블럭이 왔을 때 쌓아지는 최댓값을 구하는 함수.
	private static int xcheck(int x) {
		int result = 1;
		
		for (int i = 0; i < 4; i++) {
			int now = x + dxy[i];
			
			if (map.containsKey(now)) {
				result = Math.max(result, map.get(now) + 1);
			}
		}
		
		return result;
	}
	
	// 1 x 4 블럭이 쌓이는 최대 높이를 저장하기 위한 함수.
	private static void xinput(int x, int y) {
		for (int i = 0; i < 4; i++) {
			map.put(x + dxy[i], y);
		}
	}
}