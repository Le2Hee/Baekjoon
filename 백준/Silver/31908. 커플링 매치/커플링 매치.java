import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 약지를 확인한 사람의 수
		
		// 반지의 특징을 key 이름을 value로 하는 map
		Map<String, StringBuilder> map = new LinkedHashMap<>();
		
		String name, distinct;
		StringTokenizer st;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			distinct = st.nextToken();
			
			if (!distinct.equals("-")) { // 반지를 끼고 있으면
				if (map.containsKey(distinct)) { // 이미 반지를 끼고 있는 사람이 있다면
					map.put(distinct, map.get(distinct).append(" ").append(name));
				} else {
					map.put(distinct, new StringBuilder().append(name));
				}
			}
		}
		
		// 커플을 저장할 리스트
		List<String> names = new LinkedList<>();
		
		// 짝이 정확히 2명만 저장
		for (String s : map.keySet()) {
			st = new StringTokenizer(map.get(s).toString());
			
			if (st.countTokens() == 2) {
				names.add(map.get(s).toString());
			}
		}
		
		sb.append(names.size()).append("\n");
		for (String s : names) {
			sb.append(s).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}