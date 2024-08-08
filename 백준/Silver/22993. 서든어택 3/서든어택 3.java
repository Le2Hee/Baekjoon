import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 플레이어의 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long junwon = Long.parseLong(st.nextToken());
		
		long[] num = new long[n - 1];
		for (int i = 0; i < n - 1; i++) {
			num[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(num);
		for (int i = 0; i < n - 1; i++) {
			if (junwon > num[i]) {
				junwon += num[i];
			} else {
				sb.append("No");
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("Yes");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}