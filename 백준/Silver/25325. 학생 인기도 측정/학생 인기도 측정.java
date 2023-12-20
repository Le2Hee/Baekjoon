import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			map.put(st.nextToken(), 0);
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreElements()) {
				String name = st.nextToken();
				int val = map.get(name);
				val++;
				map.replace(name, val);
			}
		}
		
		 List<String> keySet = new ArrayList<>(map.keySet());
		 Collections.sort(keySet);
		 keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
		 
		for (String key : keySet) {
			sb.append(key).append(" ").append(map.get(key)).append("\n");
		}
		
		System.out.println(sb);
	}
}