import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 정수가 적힌 카드의 수
		int m = Integer.parseInt(st.nextToken()); // 게임의 최대 턴 수
		
		List<Integer> list = new LinkedList<>(); // 카드를 저장하는 리스트
		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		// 점수의 기준으로 내림차순 정렬
		Collections.sort(list, (o1, o2) -> o2 - o1);
		int score = 0; // 플레이어의 총 합
		
		while (m-- > 0) {
			if (list.get(0) > 0) {
				score += list.get(0);
				list.remove(0);
				
				if (list.size() != 0) {
					list.remove(list.size() - 1);
				}
			} else { // 음수만 있다면 더미 카드만 왔다 갔다 해서 턴 수를 소모할 수 있다.
				break;
			}
			
			if (list.size() == 0) { // 모든 카드가 없어지면 종료
				break;
			}
		}
		
		bw.write(Integer.toString(score));
		bw.flush();
		bw.close();
		br.close();
	}
}