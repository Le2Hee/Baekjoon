import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //  슬롯의 수
		int q = Integer.parseInt(st.nextToken()); // 풍선들을 꽂는 횟수
		
		boolean[] check = new boolean[n + 1];
		int count = n;
		
		int start, unit;
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			unit = Integer.parseInt(st.nextToken());
			
			for (int i = start; i <= n; i += unit) {
				if (!check[i]) {
					check[i] = true;
					count--;
				}
			}
		}
		
		bw.write(Long.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}