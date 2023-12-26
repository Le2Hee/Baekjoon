import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); // 문서의 개수
			int m = Integer.parseInt(st.nextToken()); // 궁금한 문서의 번호
			st = new StringTokenizer(br.readLine()); // 중요도
			int count = 0;
			
			if (n == 1) {
				sb.append(1).append("\n");
				continue;
			}
			
			// 중요도로 비교하면서 문서의 번호 일치하는지 확인 후 카운터를 출력
			Queue<Integer> importance = new LinkedList<Integer>(); // 중요도를 저장.
			Queue<Integer> numbers = new LinkedList<Integer>(); // 문서를 순서대로 저장.
			for (int j = 0; j < n; j++) {
				importance.add(Integer.parseInt(st.nextToken()));
				numbers.add(j);
			}
			
			List<Integer> sort = new ArrayList<Integer>(importance);
			Collections.sort(sort, Collections.reverseOrder()); // 중요도 내림차순으로 비교
			
			while (true) {
				int importancenum = importance.poll();
				int number = numbers.poll();
				
				if (sort.get(0) == importancenum) {
					count++;
					sort.remove(0);
					if (number == m) {
						sb.append(count).append("\n");
						break;
					}
				} else {
					importance.add(importancenum);
					numbers.add(number);
				}
			}
		}
		
		System.out.println(sb);
    }
}