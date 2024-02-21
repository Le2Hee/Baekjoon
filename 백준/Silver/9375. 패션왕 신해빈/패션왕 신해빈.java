import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int n, sum;
		StringTokenizer st;
		HashMap<String, Integer> map;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			sum = 1;
			map = new HashMap<>();
			
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String b = st.nextToken();
				
				if (map.containsKey(b)) {
					map.put(b, map.get(b) + 1);
				} else {
					map.put(b, 1);
				}
			}
			
			for (int m : map.values()) {
				sum *= m + 1;
			}
			
			sb.append(sum - 1).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}