import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 물건의 개수
		
		int max = 0; // 제일 큰 이익
		int[] profit = new int[n]; // 이익
		Integer[] sortProfit = new Integer[n]; // 이익을 정렬하기 위한 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			profit[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, profit[i]);
			sortProfit[i] = profit[i];
		}
		
		st = new StringTokenizer(br.readLine()); // 자신의 가격
		
		Arrays.sort(sortProfit, (o1, o2) -> o2 - o1); // 내림차순 정렬
		for (int i = 0; i < n; i++) {
			if (profit[i] == max) { // 가장 큰 값이 들어 왔을때, 자신을 제외한 큰 값 : sortProfit[1]
				sb.append(profit[i] - sortProfit[1]);
			} else {
				sb.append(profit[i] - max);
			}
			
			sb.append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}