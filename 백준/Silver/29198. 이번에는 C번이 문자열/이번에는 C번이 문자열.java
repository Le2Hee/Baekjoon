import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 문자열 개수
		int m = Integer.parseInt(st.nextToken()); // 문자열 길이
		int k = Integer.parseInt(st.nextToken()); // 합쳐야 되는 문자열 수
		
		StringBuilder sub;
		char[] arr;
		List<String> list = new LinkedList<>();
		for (int i = 0 ; i < n; i++) {
			arr = br.readLine().toCharArray();
			Arrays.sort(arr);
			
			sub = new StringBuilder();
			for (int j = 0; j < m; j++) {
				sub.append(arr[j]);
			}
			
			list.add(sub.toString());
		}
		
		sub = new StringBuilder();
		Collections.sort(list);
		
		for (int i = 0; i < k; i++) {
			sub.append(list.get(i));
		}
		
		arr = sub.toString().toCharArray();
		Arrays.sort(arr);
		
		for (char c : arr) {
			sb.append(c);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}