import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); 
		int n = Integer.parseInt(br.readLine()); // 게임의 수
		
		// 0 : 게임번호, 1 : 진행 횟수
		int[] result = new int[2];
		result[1] = Integer.MAX_VALUE;
		
		int num, m, count;
		StringTokenizer st;
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken()); // 말하면 지는 수
			m = Integer.parseInt(st.nextToken()); // 한번에 말할 수 있는 최대 수
			count = 0;
			
			// 게임이 진행되는 횟수
			num -= (num - 1) % (m + 1);
			count = 2 * (num / m + 1);
			
			if (result[1] > count) {
				result[0] = i;
				result[1] = count;
			}
		}
		
		sb.append(result[0]).append(" ").append(result[1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}