import java.io.*;
import java.util.*;

public class Main {
	
	public static class Team {
		int score, loss;
		
		public Team(int s, int l) {
			score = s;
			loss = l;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			Team[] arr = new Team[n + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = new Team(0, 0);
			}
			
			while (m-- > 0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int as = Integer.parseInt(st.nextToken());
				int bs = Integer.parseInt(st.nextToken());
				
				arr[a].score += as;
				arr[a].loss += bs;
				arr[b].score += bs;
				arr[b].loss += as;
			}
			
			double max = Double.MIN_VALUE;
			double min = Double.MAX_VALUE;
			double sum = 0;
			
			for (int i = 1; i <= n; i++) {
				if (Math.pow(arr[i].score, 2) + Math.pow(arr[i].loss, 2) == 0) {
					sum = 0;
				} else {
					sum = (Math.pow(arr[i].score, 2) / (Math.pow(arr[i].score, 2) + Math.pow(arr[i].loss, 2))) * 1000;
				}
				
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
			
			sb.append((int)max).append("\n").append((int)min).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}