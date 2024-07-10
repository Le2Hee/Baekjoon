import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		String s;
		int n, num, key;
		StringTokenizer st;
		TreeMap<Integer, Integer> map;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			map = new TreeMap<>();
			
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				s = st.nextToken();
				num = Integer.parseInt(st.nextToken());
				
				switch (s) {
				case "I":
					map.put(num, map.getOrDefault(num, 0) + 1);
					break;
				case "D":
					if (!map.isEmpty()) {
						key = num == 1 ? map.lastKey() : map.firstKey();
						
						if (map.put(key, map.get(key) - 1) == 1) {
							map.remove(key);
						}
					}
					break;
				}
			}
			
			if (map.isEmpty()) {
				sb.append("EMPTY\n");
			} else {
				sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}