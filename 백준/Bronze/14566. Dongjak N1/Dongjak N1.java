import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int dif = Integer.MAX_VALUE;
		int count = 0;
		Arrays.sort(arr);
		
		for (int i = 0; i < n - 1; i++) {
			dif = Math.min(dif, arr[i + 1] - arr[i]);
		}
		
		for (int i = 0; i < n - 1; i++) {
			if (arr[i + 1] - arr[i] == dif) {
				count++;
			}
		}
		
		sb.append(dif).append(" ").append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}