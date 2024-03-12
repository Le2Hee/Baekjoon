import java.io.*;
import java.util.*;

public class Main {
	
	static Map<String, Integer> map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int n, max;
		StringTokenizer st;
		String m;
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			map = new LinkedHashMap<>();
			max = 0;
			
			st = new StringTokenizer(br.readLine());
			while (n-- > 0) {
				m = st.nextToken();
				
				if (map.containsKey(m)) {
					map.put(m, map.get(m) + 1);
					max = Math.max(max, map.get(m));
				} else {
					map.put(m, 1);
				}
			}
			
			if (max >= 3) {
				sb.append(0).append("\n");
			} else if(max == 2) {
				int val2 = maxVal2();
				int val1 = maxVal1();
				sb.append(Math.min(val1, val2)).append("\n");
			} else {
				sb.append(maxVal1()).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int maxVal1() {
		int result = Integer.MAX_VALUE;
		List<String> key = new LinkedList<>(map.keySet());
		
		for (int i = 0; i < key.size() - 2; i++) {
			for (int j = i + 1; j < key.size() - 1; j++) {
				for (int k = j + 1; k < key.size(); k++) {
					result = Math.min(result, comparison(key.get(i), key.get(j)) + comparison(key.get(j), key.get(k)) + comparison(key.get(k), key.get(i)));
				}
			}
		}
		
		return result;
	}
	
	private static int maxVal2() {
		int result = Integer.MAX_VALUE;
		List<String> key = new LinkedList<>(map.keySet());
		
		for (int i = 0; i < key.size(); i++) {
			String name = key.get(i);
			
			if (map.get(name) == 2) {
				for (int j = 0; j < key.size(); j++) {
					if (!key.get(j).equals(name)) {
						result = Math.min(result, comparison(name, key.get(j)) * 2);
					}
				}
			}
		}
		
		return result;
	}
	
	private static int comparison(String a, String b) {
		int result = 0;
		
		for (int i = 0; i < 4; i++) {
			if (a.charAt(i) != b.charAt(i)) {
				result++;
			}
		}
		
		return result;
	}
}
