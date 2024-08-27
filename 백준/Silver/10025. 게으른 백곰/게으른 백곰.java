import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 양동이의 개수
		int k = Integer.parseInt(st.nextToken()) * 2 + 1; // 앨버트 범위
		
		int[] arr = new int[1000001];
		int g, x;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			g = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			arr[x] = g;
		}
		
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < 1000001; i++) {
			if (i - k >= 0) {
				sum -= arr[i - k];
			}
			
			sum += arr[i];
			max = Math.max(max, sum);
		}
		
		bw.write(Long.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
}