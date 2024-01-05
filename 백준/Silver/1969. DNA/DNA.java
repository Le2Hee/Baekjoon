import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[][] map = new String[n][m];
		
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split("");
			
			for (int j = 0; j < m; j++) {
				map[i][j] = str[j];
			}
		}
		
		int index = 0;
		Map<String, Integer> count = new HashMap<String, Integer>();
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			if (count.get(map[i][index]) == null) {
				count.put(map[i][index], 1);
			} else {
				int co = count.get(map[i][index])+ 1;
				count.replace(map[i][index], co);
			}
			
			if (i == n - 1) {
				int max = Integer.MIN_VALUE;
				String ke = "";
				
				List<String> key = new LinkedList<>(count.keySet());
				Collections.sort(key);
				
				for (String str : key) {
					result += count.get(str);
					if (max < count.get(str)) {
						max = count.get(str);
						ke = str;
					}
				}
				
				count = new HashMap<String, Integer>();
				result -= max;
				index++;
				i = -1;
				
				sb.append(ke);
				
				if (index == m) {
					break;
				}
			}
		}
		
		sb.append("\n").append(result);
		System.out.println(sb);
	}
}