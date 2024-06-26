import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 연속 동작의 횟수
		
		double[][] arr = new double[3][n];
		StringTokenizer st;
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = Double.parseDouble(st.nextToken());
			}
		}
		
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (arr[2][i] < 1) {
				sum += arr[0][i] - (int)(arr[1][i] * (arr[2][i] * 10) / 10);
			} else {
				sum += (int)(arr[0][i] * (arr[2][i] * 10) / 10) - arr[1][i];
			}
		}
		
		bw.write(Long.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}