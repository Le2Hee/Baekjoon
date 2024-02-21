import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Map<String, Integer> m = new LinkedHashMap<>();
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			String k = st.nextToken();
			int v = Integer.parseInt(st.nextToken());
			
			if (m.containsKey(k)) {
				m.put(k, m.get(k) + v);
			} else {
				m.put(k, v);
			}
		}
		
		for (int n : m.values()) {
			if (n == 5) {
				sb.append("YES");
				break;
			}
		}
		
		
		bw.write(sb.length() == 0 ? "NO" : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}