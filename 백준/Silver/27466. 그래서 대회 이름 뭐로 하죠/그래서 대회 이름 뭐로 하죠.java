import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 문자열 길이
		int m = Integer.parseInt(st.nextToken()); // 운영진이 원하는 길이
		char[] arr = br.readLine().toCharArray(); // 문자열
		
		int acount = 0;
		for (int i = 0 ; i < n - 1; i++) {
			if (arr[i] == 'A') {
				acount++;
			}
		}
		
		if (acount < 2) {
			sb.append("NO");
		} else {
			m -= 3;
			
			List<Integer> aindexs = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				if (arr[i] == 'A') {
					aindexs.add(i);
				}
			}
			
			if (aindexs.get(aindexs.size() - 2) < m) {
				sb.append("NO");
			} else {
				for (int i = aindexs.get(aindexs.size() - 2) - m; i < aindexs.get(aindexs.size() - 2); i++) {
					sb.append(arr[i]);
				}
				
				sb.append("AA").append(arr[n - 1]);
			}
		}
		
		bw.write(sb.toString().equals("NO") ? sb.toString() : "YES\n" + sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}