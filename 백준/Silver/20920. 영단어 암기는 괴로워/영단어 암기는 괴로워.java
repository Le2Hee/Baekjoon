import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 단어의 개수
		int m = Integer.parseInt(st.nextToken()); // 단어의 길이

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			if (str.length() >= m) { // 외울 단어의 길이 기준
				if (map.get(str) == null) {
					map.put(str, 1);
				} else {
					int val = map.get(str);
					val++;
					map.replace(str, val);
				}
			}
		}

		List<String> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet); // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
		keySet.sort((o1, o2) -> Integer.compare(o2.length(), o1.length())); // 해당 단어의 길이가 길수록 앞에 배치한다.
		keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); // 자주 나오는 단어일수록 앞에 배치한다.
		
		for (String key : keySet) {
			sb.append(key).append("\n");
		}

		System.out.println(sb);
	}
}