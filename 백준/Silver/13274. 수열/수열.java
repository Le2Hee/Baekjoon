import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
		long num;
		int start, end;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken()) - 1;
			end = Integer.parseInt(st.nextToken()) - 1;
			num = Long.parseLong(st.nextToken());
			
			for (int i = start; i <= end; i++) {
				arr[i] += num;
			}
			
			Arrays.sort(arr);
		}
		
		for (long m : arr) {
			sb.append(m).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}