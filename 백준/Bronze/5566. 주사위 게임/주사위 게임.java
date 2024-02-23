import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] map = new int[n];
		for (int i = 0; i < n; i++) {
			map[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dice = new int[m];
		for (int i = 0; i < m; i++) {
			dice[i] = Integer.parseInt(br.readLine());
		}
		
		int now = 0;
		int count = 0;
		for (int i = 0; i < m; i++) {
			int num = dice[i];
			
			now += num;
			if (now >= n - 1) {
				count = i + 1;
				break;
			}
			
			now += map[now];
			if (now >= n - 1) {
				count = i + 1;
				break;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
